package SmartRoom;

import java.io.IOException;
import java.util.ArrayList;

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
				System.out.println(" Server started, listening on " + port);
				 server.awaitTermination();
				 
				 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
					
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		   
	}

	
	public StreamObserver<RequestMessage> greetings (StreamObserver<ResponseMessage> responseGreeting ){
		ArrayList <String> Welcome = new ArrayList<>();
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
				
				if(insuranceComp.equals("N/A") || urgencyLvl.equals("low")) {
					confirmInComp = false;
					roomTime = 7;
				} else if (urgencyLvl.equals("medium")) {
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

	
	public StreamObserver<personalInfo> reminders(StreamObserver<confirmationResponse> responseObserver){
		ArrayList<String>events = new ArrayList<>();
		
		return new StreamObserver <personalInfo>() {
			@Override
			public void onNext(personalInfo info) {
				String NewEvent = info.getEventRmnd();
				String NewDate = info.getRemindDate();
				events.add(NewEvent);
				events.add(NewDate);
				
				/*System.out.printf("Received event: %s, remindDate: %s%n", 
						info.getEventRmnd(),
						info.getRemindDate());*/
			}
			
			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
				responseObserver.onError(t);
			}
			
			@Override
			public void onCompleted() {
				StringBuffer confirmation = new StringBuffer();
				for(int i=0; i < events.size(); i++) {
					if(i % 2 == 0 || i == 0)
					confirmation.append("Received: " + events.get(i) + "\n");
					else {
						confirmation.append("Remind date: " + events.get(i) + "\n");
						}
					}
				String ConfMessage = confirmation.toString();
				confirmationResponse response = confirmationResponse.newBuilder()
						.setConfirmed(ConfMessage)
						.build();
				
			
			responseObserver.onNext(response);
			responseObserver.onCompleted();
			}
		};
	}
}