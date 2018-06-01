package hstatboard;

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
import java.util.List;

public class test extends JFrame
{
       JPanel thoughtpanel = new JPanel();
       JLabel thoughtlabel = new JLabel("<html> <br> </html");
       JLabel mindlabel = new JLabel("Whats on your mind?");
       JTextField thoughttext = new JTextField(30);
       JButton thoughtbutton = new JButton("Enter");
   	   ArrayList  <String> thoughts = new ArrayList <String>(); 
   	   
   	   JLabel arraythought = new JLabel();

       public test()
       {
              setTitle("hstatboard");
              setVisible(true);
              setSize(600, 600);
              setDefaultCloseOperation(EXIT_ON_CLOSE);
              
              thoughtpanel.add(mindlabel);
              thoughtpanel.add(thoughttext);
              

              thoughttext.addActionListener(new ActionListener() //textfield value
              {
            	  @Override
                     public void actionPerformed(ActionEvent e)
                     {
                           String input = thoughttext.getText();
                            
                     }
              });

              thoughtpanel.add(thoughtbutton);
              
              thoughtbutton.addActionListener(new ActionListener() //button click
              {
            	  
                      public void actionPerformed(ActionEvent e)
                      {
                    	  
                    	  	String input = thoughttext.getText();
                             thoughtlabel.setText(input);
                             thoughts.add(input + "."); //add user input to array                      
                             //System.out.println(thoughts); //display array value in terminal
                             thoughtlabel.setHorizontalAlignment(JLabel.CENTER);
                             arraythought.setText(String.valueOf(thoughts));
                             //System.out.println(String.valueOf(thoughts));
                             thoughttext.setText("");
                             thoughttext.requestFocusInWindow(); //after button click, cursor set on text
                            // String[] stockthoughts = new String[thoughts.size()];
                             //stockthoughts = thoughts.toArray(stockthoughts); 
                             //System.out.println(String.valueOf(stockthoughts));
                             for (int i = 0; i < thoughts.size(); i++) {			
                     			System.out.println(thoughts.get(i));
                     			String thoughtsword = thoughts.get(i);
                     			
                     			JLabel thoughtwordlabel =new JLabel(thoughtsword);
                     			thoughtwordlabel.setText("<html> <br>" +thoughtsword + " <br> </html>");
                     			thoughtpanel.add(thoughtwordlabel);
                     			thoughts.remove(0);
                     			
                     		}
                      }
                      
              });
                           
             // thoughtpanel.add(thoughtlabel); 
              
              //arraythought.setText(String.valueOf(thoughts)); 
             thoughtpanel.add(arraythought); 			//array added to gui
             
              add(thoughtpanel); //add panel input to JFrame

       }

       public static void main(String[] args)
       {
    	   test board = new test();
       }
}