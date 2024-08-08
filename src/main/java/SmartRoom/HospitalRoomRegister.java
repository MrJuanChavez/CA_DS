package SmartRoom;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class HospitalRoomRegister {
	public static void main (String []args) throws InterruptedException {
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			
			ServiceInfo RoomControlInfo = ServiceInfo.create("_grpc._tcp.local.", "RoomControl", 4200, "path=index.html");
			jmdns.registerService(RoomControlInfo);
			System.out.println("Registered: " + InetAddress.getLocalHost() + RoomControlInfo.getPort());
			
			ServiceInfo ToolsAndInterfaceInfo = ServiceInfo.create("_grpc._tcp.local.", "ToolsAndInterface", 4201, "path=index.html");
			jmdns.registerService(ToolsAndInterfaceInfo);
			System.out.println("Registered: " + InetAddress.getLocalHost() + ToolsAndInterfaceInfo.getPort());
			
			ServiceInfo SmartIntravenousInfo = ServiceInfo.create("_grpc._tcp.local.", "SmartIntravenous", 4202, "path=index.html");
			jmdns.registerService(SmartIntravenousInfo);
			System.out.println("Registered: " + InetAddress.getLocalHost() + SmartIntravenousInfo.getPort());
			
			
		}catch(IOException e){
			e.getMessage();
		}
		
	}
}
