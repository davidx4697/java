package hstatBoard;

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
import java.util.ArrayList;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.KeyEvent;


import javax.swing.JButton;
import javax.swing.*;  
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;

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
		thoughttext.requestFocusInWindow();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		thoughtpanel.add(mindlabel); //What's on your mind on the left
		thoughtpanel.add(thoughttext);
		//thoughtpanel.add(replylabel);
		
		thoughttext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = thoughttext.getText();
				thoughtlabel.setText(input);
			}
		});
		
		thoughtpanel.add(thoughtbutton);
		
		thoughtbutton.addActionListener(new ActionListener() {  //button click
			public void actionPerformed(ActionEvent e) {
				int thoughtarray = 1; //thoughtarray 
				for (int i=0; i <100; i++) {
					//thoughtlabel.setText(input);
					JLabel label = new JLabel(String.valueOf(thoughtarray));
					label.setText(String.valueOf(thoughtlabel));
					thoughtarray++;
					thoughtlabel.add(label);
					String input = thoughttext.getText();
					thoughtlabel.setHorizontalAlignment(JLabel.CENTER);
					replylabel.setHorizontalAlignment(JLabel.LEFT);
					//thoughtlabel.setText(input); //fix input to center!
					thoughttext.setText("");
					thoughttext.requestFocusInWindow();
				}

				
				
			}
		});
	
		thoughtpanel.add(thoughtlabel);
		add( thoughtpanel);
	
	}
	public static void main (String [] args) {
		other board = new other();
	}
}  







/*
package hstatBoard;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class BoxLabels {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                Box box = Box.createVerticalBox();
                Font font = new Font("monospaced", Font.PLAIN, 11);

                JPanel sideBar = new JPanel();
                sideBar.setBackground(Color.BLACK);
                sideBar.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                sideBar.add(box);

                JTextArea text = new JTextArea(15, 50);
                text.setMargin(new Insets(5, 5, 5, 5));
                text.setBackground(Color.darkGray);
                text.setForeground(Color.white);
                text.setFont(font);
                String hello = "hi";
                int count = 1;
                for (int i = 0; i < 100; i++) {
                	//String hello = "hi";
                    JLabel label = new JLabel(String.valueOf(hello));
                    label.setFont(font);
                    label.setForeground(Color.GREEN);
                    box.add(label);
                    count++;
                }

                JPanel panel = new JPanel(new BorderLayout());
                panel.add(text);
                panel.add(sideBar, BorderLayout.WEST);

                JOptionPane.showMessageDialog(null, panel);
            }
        });
    }
}
*/