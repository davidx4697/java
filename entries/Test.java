package hstatboard;

/* package hstatboard;
import java.util.Scanner;
public class other {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("You are in the OTHER section");
		System.out.println(" ");
		System.out.println("Whats in your mind?");
		Scanner thought = new Scanner(System.in);
		String user_thought = thought.nextLine();
		System.out.println("Anonymous says, " + user_thought);
	}
} */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.applet.Applet;


import javax.swing.JButton;
import javax.swing.*;  
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.util.ArrayList;

public class other extends JFrame{
	JPanel thoughtpanel = new JPanel();
	JLabel thoughtlabel = new JLabel("<html> <br> </html");
	JLabel mindlabel = new JLabel("whats on your mind?");
	JLabel replylabel = new JLabel("<html> <br> " + "reply" + " </html");
	JTextField thoughttext = new JTextField(30); //30 means length of field horizontally 
	JButton thoughtbutton = new JButton("Enter");
	
	
	public other() {
		
		setTitle("hstatBoard");
		setVisible(true);
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		thoughtpanel.add(mindlabel); //What's on your mind on the left
		thoughtpanel.add(thoughttext);
		//thoughtpanel.add(replylabel);
		
		thoughttext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = thoughttext.getText();
				thoughtlabel.setText(input);
				thoughttext.requestFocusInWindow();
			}
		});
		
		thoughtpanel.add(thoughtbutton);
		
		thoughtbutton.addActionListener(new ActionListener() { //button listener
			public void actionPerformed(ActionEvent e) {
				String input = thoughttext.getText();
				thoughtlabel.setHorizontalAlignment(JLabel.CENTER);
				//replylabel.setHorizontalAlignment(JLabel.LEFT);
				thoughtlabel.setText(input); //fix input to center!	
				thoughttext.setText("");
				thoughttext.requestFocusInWindow();
				
				ArrayList<String> thoughtsArray = new ArrayList <String>();
				thoughtsArray.add(input);
				System.out.println(thoughtsArray);
				
			}
		});
		
		
		thoughtpanel.add(thoughtlabel);
		add( thoughtpanel);
		
		
	}
	public static void main (String [] args) {
		other board = new other();
	}
}  
		