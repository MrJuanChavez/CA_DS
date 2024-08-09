package smartRoom;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import generated.Smart_Intravenous.Smart_IntravenousGrpc.Smart_IntravenousImplBase;
import generated.Smart_Intravenous.alertMessage;
import generated.Smart_Intravenous.confirmFRate;
import generated.Smart_Intravenous.flowRate;
import generated.Smart_Intravenous.sendStatus;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class SmartIntravenousServer extends Smart_IntravenousImplBase {
	public static void main(String[] args) {
		SmartIntravenousServer controls = new SmartIntravenousServer();

		int port = 4202;

		try {
			Server server = ServerBuilder.forPort(port).addService(controls).build().start();

			System.out.println("Server started, listening on " + port);
			server.awaitTermination();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private ArrayList<Integer> drops = new ArrayList<>();
	
	public void setFlowR(flowRate fRate, StreamObserver<confirmFRate> confirmationResponse) {
		
		String clientId = Constants.CLIENT_ID_CONTEXT_KEY.get();
        System.out.println("Processing request from " + clientId);
        
		System.out.println("receiving" + fRate.getDropsPS());

		
		int dropsPS = fRate.getDropsPS();
		drops.add(dropsPS);
		confirmFRate response = null;

		if (drops.isEmpty() || drops.size() == 1) {
			response = confirmFRate.newBuilder().setSetRate("The rate " + dropsPS + " drops per minute, has been set").build();
			JOptionPane.showMessageDialog(null, response);
		} else if (dropsPS == drops.get(drops.size()-2)) {
			response = confirmFRate.newBuilder().setSetRate("Rate already set").build();
			JOptionPane.showMessageDialog(null, response);
		} else {
			response = confirmFRate.newBuilder().setSetRate("The rate " + dropsPS + " drops per minute, has been set").build();
			JOptionPane.showMessageDialog(null, response);
		}

		confirmationResponse.onNext(response);
		confirmationResponse.onCompleted();
	}

	public void alertDose(sendStatus sStatus, StreamObserver<alertMessage> alertResponse) {
		
		String clientId = Constants.CLIENT_ID_CONTEXT_KEY.get();
        System.out.println("Processing request from " + clientId);
		
		System.out.println("receiving" + sStatus.getStatus());
		String status = sStatus.getStatus();
		alertMessage response;

		if (status.isEmpty()) {
			response = alertMessage.newBuilder()
					.setAlert("Dose level status has not been stated")
					.build();
			JOptionPane.showMessageDialog(null, response);
		} else if (!status.equals("Regular Dose")) {
			response = alertMessage.newBuilder()
					.setAlert("Dose does not match the prescription: calling a healthcare assistant")
					.build();
			JOptionPane.showMessageDialog(null, response);
		}else {
			response = alertMessage.newBuilder()
					.setAlert("There is nothing wrong with the dose level.")
					.build();
			JOptionPane.showMessageDialog(null, response);
		}

		alertResponse.onNext(response);
		alertResponse.onCompleted();
	}
}
