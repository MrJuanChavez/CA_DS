package smartRoom;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class HospitalRoomRegister {
	public static void main (String []args) throws InterruptedException {
		try {
			//create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			
			//register services
			ServiceInfo RoomControlInfo = ServiceInfo.create("_grpc._tcp.local.", "RoomControl", 4200, "path=index.html");
			jmdns.registerService(RoomControlInfo);
			System.out.println("Registered: " + InetAddress.getLocalHost() + RoomControlInfo.getPort());
			//wait a bit
			Thread.sleep(1000);
			
			ServiceInfo ToolsAndInterfaceInfo = ServiceInfo.create("_grpc._tcp.local.", "ToolsAndInterface", 4201, "path=index.html");
			jmdns.registerService(ToolsAndInterfaceInfo);
			System.out.println("Registered: " + InetAddress.getLocalHost() + ToolsAndInterfaceInfo.getPort());
			//wait a bit
			Thread.sleep(1000);
			
			ServiceInfo SmartIntravenousInfo = ServiceInfo.create("_grpc._tcp.local.", "SmartIntravenous", 4202, "path=index.html");
			jmdns.registerService(SmartIntravenousInfo);
			System.out.println("Registered: " + InetAddress.getLocalHost() + SmartIntravenousInfo.getPort());
			//wait a bit
			Thread.sleep(1000);
			
		}catch(IOException e){
			e.getMessage();
		}
		
	}
}
