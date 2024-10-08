package smartRoom;

import java.io.IOException;

import generated.Room_control.Room_controlGrpc.Room_controlImplBase;
import generated.Room_control.adjustTemperature;
import generated.Room_control.changeIntensity;
import generated.Room_control.lightsIntensity;
import generated.Room_control.newTemperature;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class RoomControlServer extends Room_controlImplBase{
	public static void main (String [] args) {
		RoomControlServer controls = new RoomControlServer();
		
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
	
	public void lights (changeIntensity intensityLvl, StreamObserver <lightsIntensity> responseIntensity) {
		String clientId = Constants.CLIENT_ID_CONTEXT_KEY.get();
        System.out.println("Processing request from " + clientId);
		
        System.out.println("receiving" + intensityLvl.getLevel());
		
		int intensity = 1;
		String location = "Reception";
		
		intensity = intensityLvl.getLevel();
		
		lightsIntensity response = lightsIntensity.newBuilder().setNewLvl(intensity).setLocation(location).build();
		
		responseIntensity.onNext(response);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		location = "Toilet";
		response = lightsIntensity.newBuilder().setNewLvl(intensity).setLocation(location).build();
		
		responseIntensity.onNext(response);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		location = "Bed area";
		response = lightsIntensity.newBuilder().setNewLvl(intensity).setLocation(location).build();
		
		responseIntensity.onNext(response);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		responseIntensity.onCompleted();
	}
	
	public void temperature (adjustTemperature newTemp, StreamObserver <newTemperature> responseTemperature) {
		System.out.println("receiving" + newTemp.getTemp());
		int temp = newTemp.getTemp();
		newTemperature response = null;
		if (temp < 16) {
			response = newTemperature.newBuilder().setNewTemp(temp+5).build();
		} else if (temp > 27) {
			response = newTemperature.newBuilder().setNewTemp(temp-5).build();
		}
		
		responseTemperature.onNext(response);
		responseTemperature.onCompleted();
	}
}
