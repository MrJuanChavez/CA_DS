package smartRoom;

import java.awt.event.ActionEvent;

import generated.Room_control.Room_controlGrpc;
import generated.Room_control.Room_controlGrpc.Room_controlBlockingStub;
import generated.Room_control.Room_controlGrpc.Room_controlStub;
import generated.Room_control.adjustTemperature;
import generated.Room_control.changeIntensity;
import generated.Room_control.lightsIntensity;
import generated.Room_control.newTemperature;
import generated.Smart_Intravenous.Smart_IntravenousGrpc;
import generated.Smart_Intravenous.Smart_IntravenousGrpc.Smart_IntravenousStub;
import generated.Smart_Intravenous.alertMessage;
import generated.Smart_Intravenous.confirmFRate;
import generated.Smart_Intravenous.flowRate;
import generated.Smart_Intravenous.sendStatus;
import generated.tools_and_interface.RequestMessage;
import generated.tools_and_interface.ResponseMessage;
import generated.tools_and_interface.confirmationResponse;
import generated.tools_and_interface.personalInfo;
import generated.tools_and_interface.tools_and_interfaceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

//This is a class I created as a Client to try the servers before I made the GUI I left it in the project as a backlog of the process
public class HospitalRoomClient {
	private static Room_controlStub asyncRoom_controlStub;
	private static Room_controlBlockingStub blockingRoom_controlStub;
	private static tools_and_interfaceGrpc.tools_and_interfaceStub asynctools_and_interfaceStub;
	private static Smart_IntravenousStub asyncSmart_IntravenousStub;
	
	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localHost", 4200)
				.usePlaintext()
				.build();
		asyncRoom_controlStub = Room_controlGrpc.newStub(channel);
		blockingRoom_controlStub = Room_controlGrpc.newBlockingStub(channel);
		asynctools_and_interfaceStub = tools_and_interfaceGrpc.newStub(channel);
		asyncSmart_IntravenousStub = Smart_IntravenousGrpc.newStub(channel);
		
		System.out.println("Client started");
		//greetings();
		//reminders();
		setFlowR();
		alertDose();
		}
	
	public static void lights() {
		
		changeIntensity request = changeIntensity.newBuilder().setLevel(1).build();
		StreamObserver<lightsIntensity> observer = new StreamObserver<lightsIntensity>() {

			@Override
			public void onNext(lightsIntensity value) {
				// TODO Auto-generated method stub
				System.out.println("The lights intentsity at " + value.getLocation() + "has been changed to level " + value.getNewLvl());
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
	
	public static void reminders() {
		StreamObserver<confirmationResponse> observerInfo = new StreamObserver<confirmationResponse>(){
			@Override
			public void onNext(confirmationResponse response) {
				System.out.printf("Remider confirmation received: %s%n",
						response.getConfirmed());
			}
			
			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}
			
			@Override
			public void onCompleted() {
				System.out.println("Stream completed.");
			}
		
		};
		
		StreamObserver<personalInfo> responseObserver = asynctools_and_interfaceStub.reminders(observerInfo);
		try {
			responseObserver.onNext(personalInfo.newBuilder().setEventRmnd("Paracetamol").setRemindDate("2024-12-27").build());
			Thread.sleep(700);
			responseObserver.onNext(personalInfo.newBuilder().setEventRmnd("Omeprazol").setRemindDate("2024-12-22").build());
			Thread.sleep(700);
			
			responseObserver.onCompleted();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void setFlowR() {
		
		flowRate request = flowRate.newBuilder().setDropsPS(15).build();
		StreamObserver<confirmFRate> observer = new StreamObserver<confirmFRate>() {

			@Override
			public void onNext(confirmFRate value) {
				// TODO Auto-generated method stub
				System.out.println(value.getSetRate());
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
		asyncSmart_IntravenousStub.setFlowR(request, observer);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void alertDose() {
		
		sendStatus request = sendStatus.newBuilder().setStatus("Below Normal").build();
		StreamObserver<alertMessage> observer = new StreamObserver<alertMessage>() {

			@Override
			public void onNext(alertMessage value) {
				// TODO Auto-generated method stub
				System.out.println(value.getAlert());
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
		asyncSmart_IntravenousStub.alertDose(request, observer);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}