package boardclient;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame{
	private JTextField clientText;
	private JTextArea clientWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String serverIP;
	private Socket connection;
	//custom colors
	Color coolGrey=Color.decode("#edf1f5");
	Color coolBlue=Color.decode("#0E5D9E");
	
	public Client (String host) {
		setTitle("IP Client");
		serverIP= host;
		
		clientText=new JTextField();
		clientText.setForeground(coolBlue);
		clientText.setEditable(false);
		clientText.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						sendMessage(event.getActionCommand());
						clientText.setText("");
						
						}
					
					}
				);
		add(clientText, BorderLayout.NORTH);
		clientWindow = new JTextArea();
		clientWindow.setBackground(coolGrey);
		add(new JScrollPane(clientWindow), BorderLayout.CENTER);
		
		setSize(400,450);
		setVisible(true);
	}
	//connect to server
		public void startRunning(){
			
			try{	
				connectToServer();
				setupStreams();
				whileConnected();	
				//ioexception keeps this method running even if something else fails
			}catch(EOFException oefException){
				showMessage("\n Percy ended the connection");
			}catch(IOException ioException){
				ioException.printStackTrace();
				
			}finally{
				closeConnection();
				
			}
		}
		
		//connect to server
		private void connectToServer() throws IOException{
			showMessage("Attempting Connection..\n");
			//grabs ipaddress, and connects it to the port # 6789
			connection = new Socket(InetAddress.getByName(serverIP),6789);
		}
		// setup streams
		private void setupStreams() throws IOException{
			output = new ObjectOutputStream(connection.getOutputStream());
			//does not keep output data, keeps everything clean and organized
			output.flush();
			input = new ObjectInputStream(connection.getInputStream());
			
		}
		// connected
		private void whileConnected() throws IOException{
			ableToType(true);
			do{
				try{
					message = (String) input.readObject();
					
					showMessage("\n" + message);
					//if the above does not work, java will show the message below in the textarea
				}catch(ClassNotFoundException classNotFoundException){
					
					showMessage("\n I dont know that object");
					
				}
				//ends connection for me
			}while(!message.equals("Karl: END"));	
		}
		private void closeConnection(){
			showMessage("\n Closing down");
			ableToType(false);
			try{
				//closes everything when message equals Karl:END
				output.close();
				input.close();
				connection.close();
				
				
			}catch(IOException ioException){
				ioException.printStackTrace();
			}
		}
		//send message to server
		private void sendMessage(String message){
			try{
				output.writeObject("Percy: " + message);
				output.flush();
				showMessage("\nPercy:  " + message);
								
			}catch(IOException ioException){
				//if this method fails, send the message below
				clientWindow.append("\n Something messed up sending message");
				
			}
		}
		// show message
		private void showMessage(final String message){
			//if not connected, cant send message to textarea
			SwingUtilities.invokeLater(
					new Runnable(){
						//allows messages to be added into textarea 
						public void run(){
							clientWindow.append(message);
							
					}
						
				}
					
			);
		}
		//edit using invoke
		private void ableToType(final boolean trueofalse){
			//does not allow user to type if not connected
			SwingUtilities.invokeLater(
					new Runnable(){
						public void run(){
							clientText.setEditable(trueofalse);
							
					}
						
				}
					
			);		
			
		}
	
}

