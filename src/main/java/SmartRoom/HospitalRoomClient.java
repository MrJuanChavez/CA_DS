package SmartRoom;

import generated.Room_control.Room_controlGrpc;
import generated.Room_control.Room_controlGrpc.Room_controlBlockingStub;
import generated.Room_control.Room_controlGrpc.Room_controlStub;
import generated.Room_control.adjustTemperature;
import generated.Room_control.changeIntensity;
import generated.Room_control.lightsIntensity;
import generated.Room_control.newTemperature;
import generated.tools_and_interface.RequestMessage;
import generated.tools_and_interface.ResponseMessage;
import generated.tools_and_interface.tools_and_interfaceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class HospitalRoomClient {
	private static Room_controlStub asyncRoom_controlStub;
	private static Room_controlBlockingStub blockingRoom_controlStub;
	private static tools_and_interfaceGrpc.tools_and_interfaceStub asynctools_and_interfaceStub;
	
	
	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localHost", 4200)
				.usePlaintext()
				.build();
		asyncRoom_controlStub = Room_controlGrpc.newStub(channel);
		blockingRoom_controlStub = Room_controlGrpc.newBlockingStub(channel);
		asynctools_and_interfaceStub = tools_and_interfaceGrpc.newStub(channel);
	}
	
	public static void lights () {
		
		changeIntensity request = changeIntensity.newBuilder().setLevel(1).build();
		StreamObserver<lightsIntensity> observer = new StreamObserver<lightsIntensity>() {

			@Override
			public void onNext(lightsIntensity value) {
				// TODO Auto-generated method stub
				System.out.println("The lights intentsity at " + value.getLocation() + "has been changed to level " + value.getLength());
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("Service completed");
			}
			
		};
		asyncRoom_controlStub.lights(request, observer);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void temperature() {
		int temp = 15; 
		System.out.println("The current temperature is: " + temp);
		adjustTemperature request = adjustTemperature.newBuilder().setTemp(temp).build();
		
		newTemperature response = blockingRoom_controlStub.temperature(request);
		System.out.println("The temperature has been adjusted to: " + response.getNewTemp());
	}
	
	public static void greetings() {
		StreamObserver<RequestMessage> requestObserver = asynctools_and_interfaceStub.greetings(new StreamObserver<ResponseMessage>(){
			@Override
			public void onNext(ResponseMessage response) {
				System.out.printf("Received response: %s, confirmInComp: %s, roomTime: %d%n",
						response.getGreetingText(),
						response.getName(),
						response.getConfirmInComp(),
						response.getRoomTime());
			}
			
			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}
			
			@Override
			public void onCompleted() {
				System.out.println("Stream completed.");
			}
		
		});
		
		requestObserver.onNext(RequestMessage.newBuilder()
				.setName("Ciara")
				.setInsuranceComp("N/A")
				.setUrgencyLvl("low")
				.build());
		
		requestObserver.onNext(RequestMessage.newBuilder()
				.setName("Alan")
				.setInsuranceComp("Health LLC")
				.setUrgencyLvl("high")
				.build());
		
		requestObserver.onNext(RequestMessage.newBuilder()
				.setName("Eric")
				.setInsuranceComp("St.Patrick LLC")
				.setUrgencyLvl("medium")
				.build());
		
		requestObserver.onCompleted();
	}
}