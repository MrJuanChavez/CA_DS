package SmartRoom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.google.common.base.Strings;

import generated.Room_control.Room_controlGrpc;
import generated.Room_control.adjustTemperature;
import generated.Room_control.changeIntensity;
import generated.Room_control.lightsIntensity;
import generated.Room_control.newTemperature;
import generated.Room_control.Room_controlGrpc.Room_controlBlockingStub;
import generated.Room_control.Room_controlGrpc.Room_controlStub;
import generated.Smart_Intravenous.Smart_IntravenousGrpc;
import generated.Smart_Intravenous.alertMessage;
import generated.Smart_Intravenous.confirmFRate;
import generated.Smart_Intravenous.flowRate;
import generated.Smart_Intravenous.sendStatus;
import generated.Smart_Intravenous.Smart_IntravenousGrpc.Smart_IntravenousStub;
import generated.tools_and_interface.RequestMessage;
import generated.tools_and_interface.ResponseMessage;
import generated.tools_and_interface.confirmationResponse;
import generated.tools_and_interface.personalInfo;
import generated.tools_and_interface.tools_and_interfaceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class SmartRoomGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Room_controlStub asyncRoom_controlStub;
	private static Room_controlBlockingStub blockingRoom_controlStub;
	private static tools_and_interfaceGrpc.tools_and_interfaceStub asynctools_and_interfaceStub;
	private static Smart_IntravenousStub asyncSmart_IntravenousStub;
	private JTextField eventFld;
	private JTextField dateFld;
	private JTextField nameFld;
	private JTextField insuranceCoFld;
	String event;
	String date;
	ArrayList <String> PreEvent = new ArrayList<>();
	String name;
	String insuranceComp;
	String urgencyLvl;
	ArrayList <String> PreGreeting = new ArrayList<>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localHost", 4200)
				.usePlaintext()
				.build();
		asyncRoom_controlStub = Room_controlGrpc.newStub(channel);
		blockingRoom_controlStub = Room_controlGrpc.newBlockingStub(channel);
		asynctools_and_interfaceStub = tools_and_interfaceGrpc.newStub(channel);
		asyncSmart_IntravenousStub = Smart_IntravenousGrpc.newStub(channel);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SmartRoomGUI frame = new SmartRoomGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SmartRoomGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Service1Pnl = new JPanel();
		Service1Pnl.setBorder(new TitledBorder(null, "Room Controls", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Service1Pnl.setBounds(10, 276, 428, 123);
		contentPane.add(Service1Pnl);
		Service1Pnl.setLayout(null);
		
		JSpinner LightsSpinner = new JSpinner();
		LightsSpinner.setBounds(36, 34, 43, 36);
		LightsSpinner.setFont(new Font("Tahoma", Font.PLAIN, 24));
		LightsSpinner.setModel(new SpinnerNumberModel(1, 1, 3, 1));
		Service1Pnl.add(LightsSpinner);
		
		JLabel lblNewLabel = new JLabel("Lights intensity");
		lblNewLabel.setBounds(26, 15, 91, 13);
		Service1Pnl.add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(140, 15, 264, 96);
		Service1Pnl.add(scrollPane_1);
		
		JTextArea S1txtArea = new JTextArea();
		scrollPane_1.setViewportView(S1txtArea);
		S1txtArea.setLineWrap(true);
		S1txtArea.setEditable(false);
				
//		send light intensity
		JButton SendBtnS1 = new JButton("Send");
		SendBtnS1.setBounds(26, 80, 66, 21);
		SendBtnS1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					int IntensitySpnr = (int) LightsSpinner.getValue();
					
					changeIntensity request = changeIntensity.newBuilder().setLevel(IntensitySpnr).build();
					StreamObserver<lightsIntensity> observer = new StreamObserver<lightsIntensity>() {

						@Override
						public void onNext(lightsIntensity value) {
							// TODO Auto-generated method stub
							S1txtArea.append("The lights intentsity at " + value.getLocation() + " has been changed to level " + value.getNewLvl() + "\n");
							System.out.println("The lights intentsity at " + value.getLocation() + " has been changed to level " + value.getNewLvl());
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
					} catch (InterruptedException iE) {
						// TODO Auto-generated catch block
						iE.printStackTrace();
					}
			}
		});
		Service1Pnl.add(SendBtnS1);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Reminder", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 404, 428, 123);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		eventFld = new JTextField();
		eventFld.setBounds(10, 35, 118, 19);
		panel_1.add(eventFld);
		eventFld.setColumns(10);
		
		dateFld = new JTextField();
		dateFld.setBounds(10, 70, 118, 19);
		panel_1.add(dateFld);
		dateFld.setColumns(10);
		
		JLabel Eventlbl = new JLabel("Event\r\n");
		Eventlbl.setBounds(10, 20, 45, 13);
		panel_1.add(Eventlbl);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setBounds(10, 55, 45, 13);
		panel_1.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(138, 14, 267, 96);
		panel_1.add(scrollPane);
		
		JTextArea S2txtArea = new JTextArea();
		scrollPane.setViewportView(S2txtArea);
		S2txtArea.setLineWrap(true);
		S2txtArea.setEditable(false);
				
//		Set reminder
		JButton setBtn = new JButton("Set");
		setBtn.setBounds(70, 92, 58, 21);
		setBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					StreamObserver<personalInfo> observerInfo = asynctools_and_interfaceStub.reminders(new StreamObserver<confirmationResponse>(){
						
						@Override
						public void onNext(confirmationResponse response) {
							String confirmation = String.format("Remider confirmation received:\n%s%n",
									response.getConfirmed());
							S2txtArea.append("\n" + confirmation);
							System.out.printf(confirmation);
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
					
					/*observerInfo.onNext(personalInfo.newBuilder().setEventRmnd(event).setRemindDate(date).build());
					observerInfo.onNext(personalInfo.newBuilder().setEventRmnd(event).setRemindDate(date).build());*/
					if(PreEvent.isEmpty()) {
						S2txtArea.append("There is no info to be send \n");
					}
					else {
					for(int i=0; i < PreEvent.size(); i+=2) {
						observerInfo.onNext(personalInfo.newBuilder().setEventRmnd(PreEvent.get(i)).setRemindDate(PreEvent.get(i+1)).build());
						}
					}
					observerInfo.onCompleted();
				}
		});
		panel_1.add(setBtn);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Smart Intravenous", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(305, 10, 127, 203);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox alertCB = new JComboBox();
		alertCB.setModel(new DefaultComboBoxModel(new String[] {"", "Below Dose", "Regular Dose", "Over Dose"}));
		alertCB.setBounds(10, 131, 96, 21);
		panel_2.add(alertCB);
		
		JLabel flowLbl = new JLabel("Alert");
		flowLbl.setBounds(10, 111, 67, 13);
		panel_2.add(flowLbl);
		
		JLabel lblNewLabel_5 = new JLabel("Set Flow Rate");
		lblNewLabel_5.setBounds(10, 24, 85, 13);
		panel_2.add(lblNewLabel_5);
		
		JSpinner FRspinner = new JSpinner();
		FRspinner.setBounds(10, 47, 96, 20);
		panel_2.add(FRspinner);
		
//		set flow rate service
		JButton setFlowBtn = new JButton("Set Rate");
		setFlowBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int flowSpnr = (int) FRspinner.getValue();
				flowRate request = flowRate.newBuilder().setDropsPS(flowSpnr).build();
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
				} catch (InterruptedException eE) {
					// TODO Auto-generated catch block
					eE.printStackTrace();
				}
			}
		});
		setFlowBtn.setBounds(10, 80, 96, 21);
		panel_2.add(setFlowBtn);
		
//		alert service send status
		JButton sendStatusBtn = new JButton("Send Status");
		sendStatusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String statusCB = (String) alertCB.getSelectedItem();
				sendStatus request = sendStatus.newBuilder().setStatus(statusCB).build();
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
				} catch (InterruptedException oE) {
					// TODO Auto-generated catch block
					oE.printStackTrace();
				}
			}
		});
		sendStatusBtn.setBounds(10, 162, 96, 21);
		panel_2.add(sendStatusBtn);
		
		//temperature(S1txtArea);
		
		JList list = new JList();
		list.setBounds(480, 88, 1, 1);
		panel_1.add(list);
		
//		add reminder 
		JButton addBtn = new JButton("Add");
		addBtn.setBounds(10, 92, 58, 21);
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				event = eventFld.getText();
				date = dateFld.getText();
				
				PreEvent.add(event);
				PreEvent.add(date);
			}
		});
		panel_1.add(addBtn);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Welcome", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 10, 285, 256);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(10, 26, 45, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Insurance Company");
		lblNewLabel_3.setBounds(10, 58, 132, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Urgency Lvl\r\n");
		lblNewLabel_4.setBounds(10, 88, 97, 13);
		panel.add(lblNewLabel_4);
		
		nameFld = new JTextField();
		nameFld.setBounds(165, 24, 96, 19);
		panel.add(nameFld);
		nameFld.setColumns(10);
		
		insuranceCoFld = new JTextField();
		insuranceCoFld.setBounds(164, 56, 96, 19);
		panel.add(insuranceCoFld);
		insuranceCoFld.setColumns(10);
		
		JComboBox urgencyCB = new JComboBox();
		urgencyCB.setBounds(165, 85, 96, 21);
		panel.add(urgencyCB);
		urgencyCB.setModel(new DefaultComboBoxModel(new String[] {"low", "medium", "high"}));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 147, 262, 99);
		panel.add(scrollPane_2);
		
		JTextArea greetTxtxA = new JTextArea();
		greetTxtxA.setLineWrap(true);
		scrollPane_2.setViewportView(greetTxtxA);
		
//		Submit info for greeting service to the server
		JButton SubmitBtn = new JButton("Submit");
		SubmitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					StreamObserver<RequestMessage> requestObserver = asynctools_and_interfaceStub.greetings(new StreamObserver<ResponseMessage>(){
						@Override
						public void onNext(ResponseMessage response) {
							String greetResponse = String.format("Received response: %s, confirmInComp: %s\n",
									response.getGreetingText(),
//									response.getName(),
									response.getConfirmInComp() + ", Room Time: " + response.getRoomTime());
							greetTxtxA.append(greetResponse);
							System.out.print(greetResponse);
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
					if(PreGreeting.isEmpty()) {
						greetTxtxA.append("There is no info to be send \n");
					}else {
						try {
							for(int i=0; i < PreGreeting.size(); i+=3) {
								if(i+2 >= PreGreeting.size()) {
									greetTxtxA.append("There is not enough data \n");
									break;
								}
								
								RequestMessage reqMessage = RequestMessage.newBuilder()
										.setName(PreGreeting.get(i))
										.setInsuranceComp(PreGreeting.get(i+1))
										.setUrgencyLvl(PreGreeting.get(i+2))
										.build();
								
								requestObserver.onNext(reqMessage);
							}
							requestObserver.onCompleted();
						} catch (Exception aE) {
							greetTxtxA.append("error ocurred: " + aE.getMessage() + "\n");
							aE.printStackTrace();
							requestObserver.onError(aE);
						}
					}
					/*requestObserver.onNext(RequestMessage.newBuilder()
							.setName(nameFld.getText())
							.setInsuranceComp(insuranceCoFld.getText())
							.setUrgencyLvl((String) urgencyCB.getSelectedItem())
							.build());
					
					/*requestObserver.onNext(RequestMessage.newBuilder()
							.setName("Alan")
							.setInsuranceComp("Health LLC")
							.setUrgencyLvl("high")
							.build());
					
					requestObserver.onNext(RequestMessage.newBuilder()
							.setName("Eric")
							.setInsuranceComp("St.Patrick LLC")
							.setUrgencyLvl("medium")
							.build());*/

					
			}
		});
		
		SubmitBtn.setBounds(165, 116, 85, 21);
		panel.add(SubmitBtn);
		
//		add info to the client array
		JButton addInfoBtn = new JButton("Add info");
		addInfoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = nameFld.getText();
				insuranceComp = insuranceCoFld.getText(); 
				urgencyLvl = (String) urgencyCB.getSelectedItem();
				
				if(name.isEmpty() || name.isBlank() ||insuranceComp.isEmpty()||insuranceComp.isBlank()||urgencyLvl.isEmpty()||urgencyLvl.isBlank()) {
					JOptionPane.showMessageDialog(null, "Some field has not been filed with information, the info has not been charged to the system");
				}else { 
				PreGreeting.add(name);
				PreGreeting.add(insuranceComp);
				PreGreeting.add(urgencyLvl);
				}
			}
		});
		addInfoBtn.setBounds(10, 116, 85, 21);
		panel.add(addInfoBtn);
	}
	
	public static void temperature(JTextArea S1txtArea) {
		int temp = 15; 
		S1txtArea.append("The current temperature is: " + temp + "\n");
		System.out.println("The current temperature is: " + temp);
		adjustTemperature request = adjustTemperature.newBuilder().setTemp(temp).build();
		
		newTemperature response = blockingRoom_controlStub.temperature(request);
		S1txtArea.append("The temperature has been adjusted to: " + response.getNewTemp() + "\n");
		System.out.println("The temperature has been adjusted to: " + response.getNewTemp());
	}
}
