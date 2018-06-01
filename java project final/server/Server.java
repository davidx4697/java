package boardserver;

import java.io.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.color.*;

public class Server extends JFrame {
		private JTextField userMessage;
		private JTextArea usersMessages;
		private ObjectOutputStream output;
		private ObjectInputStream input;
		private ServerSocket server;
		private Socket connection;
		Color coolGrey=Color.decode("#edf1f5");
		Color coolRed=Color.decode("#B61C23");
		
		
		public Server() {
			setTitle("Port Server");
			userMessage=new JTextField();
			userMessage.setForeground(coolRed);
			userMessage.setEditable(false);
			userMessage.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							sendMessage(event.getActionCommand());
							userMessage.setText("");
						}
					}
			);
			add(userMessage, BorderLayout.NORTH);
			usersMessages=new JTextArea();
			usersMessages.setBackground(coolGrey);
			add(new JScrollPane(usersMessages));
			
			setSize(400,450);
			setVisible(true);
		}
		public void startRunning(){
			try{
				server = new ServerSocket(6789);
				while(true){
					try{
						waitConnection();
						setupStreams();
						whileConnected();
						
					}catch(EOFException eofException){
						showMessage("\n Karl ended the connection!");
						
					}finally{
						
						closeConnection();
					}
					
				}
				
			}catch(IOException ioException){
				ioException.printStackTrace();
				
			}
			
		}
		//wait for connection, then display connection information
		
		private void waitConnection() throws IOException{
			showMessage("Waiting for connection\n");
			connection = server.accept();
			
		}
		//get stream to send and receive data
		
		private void setupStreams() throws IOException{
			output = new ObjectOutputStream(connection.getOutputStream());
			output.flush();
			input = new ObjectInputStream(connection.getInputStream());
			
			
		}
		// during the chat
		private void whileConnected() throws IOException{
			String message = "You are now connected ";
			sendMessage(message);
			ableToType(true);
			do{
				//have a conversation
				try{
					message = (String) input.readObject();
					showMessage("\n" + message);
				}catch(ClassNotFoundException classNotFoundException){
					showMessage("\n Something is wrong");
					
				}
				
			}while(!message.equals("Percy: END"));
			
		}
		//close socket connection
		private void closeConnection(){
			showMessage("\n Closing connection...\n");
			ableToType(false);
			try{
				output.close();
				input.close();
				connection.close();
				
				
			}catch(IOException ioException){
				ioException.printStackTrace();
			}
			
		}
		//send messages
		private void sendMessage(String message){
			try{
				output.writeObject("Karl: " + message);
				output.flush();
				showMessage("\nKarl: " + message);
				
			}catch(IOException ioException){
				usersMessages.append("\n ERROR");
				
			}
			
		}
		
		//updates users messages
		private void showMessage(final String text){
			SwingUtilities.invokeLater(
						new Runnable(){
							public void run(){
								usersMessages.append(text);
								
								
							}
							
						}
					);
		}
		
		//text field is not editable after connection
		private void ableToType(final boolean trueofalse){
			SwingUtilities.invokeLater(
					new Runnable(){
						public void run(){
							userMessage.setEditable(trueofalse);
							
							
						}
						
					}
				);		
			
		}
}
