package SmartRoom;

import java.io.IOException;
import java.util.ArrayList;

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

		int port = 4200;

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

	public void setFlowR(flowRate fRate, StreamObserver<confirmFRate> confirmationResponse) {
		System.out.println("receiving" + fRate.getDropsPS());

		ArrayList<Integer> drops = new ArrayList<>();
		int dropsPS = fRate.getDropsPS();
		drops.add(dropsPS);
		confirmFRate response = null;

		if (drops.isEmpty() || drops.size() == 1) {
			response = confirmFRate.newBuilder().setSetRate("The rate " + dropsPS + " drops per minute, has been set").build();
		} else if (dropsPS == drops.get(drops.size() - 2)) {
			response = confirmFRate.newBuilder().setSetRate("Rate already set").build();
		} else {
			response = confirmFRate.newBuilder().setSetRate("The rate " + dropsPS + " drops per minute, has been set").build();
		}

		confirmationResponse.onNext(response);
		confirmationResponse.onCompleted();
	}

	public void alertDose(sendStatus sStatus, StreamObserver<alertMessage> alertResponse) {
		System.out.println("receiving" + sStatus.getStatus());
		String status = sStatus.getStatus();
		alertMessage response;

		if (status.isEmpty()) {
			response = alertMessage.newBuilder()
					.setAlert("Dose level has not been set")
					.build();
		} else if (!status.equals("Regular Dose")) {
			response = alertMessage.newBuilder()
					.setAlert("Dose does not match the prescription: calling a healthcare assistant")
					.build();
		}else {
			response = alertMessage.newBuilder()
					.setAlert("There is nothing wrong with the dose level.")
					.build();
		}

		alertResponse.onNext(response);
		alertResponse.onCompleted();
	}
}
