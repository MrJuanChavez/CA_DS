package SmartRoom;

import java.io.IOException;

import generated.tools_and_interface.RequestMessage;
import generated.tools_and_interface.ResponseMessage;
import generated.tools_and_interface.confirmationResponse;
import generated.tools_and_interface.personalInfo;
import generated.tools_and_interface.tools_and_interfaceGrpc.tools_and_interfaceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class ToolsAndInterfaceServer extends tools_and_interfaceImplBase{
	public static void main (String [] args) {
		ToolsAndInterfaceServer controls = new ToolsAndInterfaceServer();
		
		int port = 4200;
		
		try {
			Server server = ServerBuilder.forPort(port)
				    .addService(controls)
				    .build()
				    .start();
				
				 server.awaitTermination();
				 System.out.println(" Server started, listening on" + port);
				 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
					
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		   
	}

	@Override
	public StreamObserver<RequestMessage> greetings (StreamObserver<ResponseMessage> responseGreeting ){
		return new StreamObserver <RequestMessage>() {
			
			@Override
			public void onNext(RequestMessage greetingMsg){
				System.out.printf("receiving %s, %s and %s", 
						greetingMsg.getName(), 
						greetingMsg.getInsuranceComp(), 
						greetingMsg.getUrgencyLvl());
				
				String name = greetingMsg.getName();
				String insuranceComp = greetingMsg.getInsuranceComp();
				String urgencyLvl = greetingMsg.getUrgencyLvl();
				String greetingText = "Hello " + name;
				boolean confirmInComp = true;
				int roomTime;
				
				if(insuranceComp == "N/A" && urgencyLvl == "low") {
					confirmInComp = false;
					roomTime = 7;
				} else if (urgencyLvl == "medium") {
					roomTime = 12;
				} else {
					roomTime = 15;
				}
				
				ResponseMessage message = ResponseMessage.newBuilder()
						.setGreetingText(greetingText)
						.setConfirmInComp(confirmInComp)
						.setRoomTime(roomTime)
						.build();
				responseGreeting.onNext(message);
			}
			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				t.printStackTrace();
				responseGreeting.onError(t);
			}
	
			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				responseGreeting.onCompleted();
			}	
		};
	}


/*public void greetings (RequestMessage greetingMsg, StreamObserver <ResponseMessage> responseGreeting) {
	System.out.printf("receiving %s, %s and %s", greetingMsg.getName(), greetingMsg.getInsuranceComp(), greetingMsg.getUrgencyLvl());
	
	String name = greetingMsg.getName();
	String insuranceComp = greetingMsg.getInsuranceComp();
	String urgencyLvl = greetingMsg.getUrgencyLvl();
	String greetingText = "Hello " + name;
	boolean confirmInComp = true;
	int roomTime;
	
	if(insuranceComp == "N/A" && urgencyLvl == "low") {
		confirmInComp = false;
		roomTime = 7;
	} else if (urgencyLvl == "medium") {
		roomTime = 12;
	} else {
		roomTime = 15;
	}
	
	ResponseMessage message = ResponseMessage.newBuilder().setGreetingText(greetingText).setConfirmInComp(confirmInComp).setRoomTime(roomTime).build();
	responseGreeting.onNext(message);
	
}*/

	@Override
	public StreamObserver<personalInfo> reminders(StreamObserver<confirmationResponse> responseObserver){
		return new StreamObserver <personalInfo>() {
			
			@Override
			public void onNext(personalInfo info) {
				System.out.printf("Received drug: %s, remindDate: %s%n", 
						info.getDrug(),
						info.getRemindDate());
			}
			
			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
				responseObserver.onError(t);
			}
			
			@Override
			public void onCompleted() {
				confirmationResponse response = confirmationResponse.newBuilder()
						.setConfirmed(true)
						.build();
			
			responseObserver.onNext(response);
			responseObserver.onCompleted();
			}
		};
	}
}