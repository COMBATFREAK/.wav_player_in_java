package Gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class labels {

	public static void main(String[] args) {

		JFrame jf= new JFrame();
		
		//Jlabel acts as a GUI display area for text, image or both
		
		JLabel lab=new JLabel();
		lab.setText("Overlord of death Ainz Ool Gown");
		jf.add(lab);
		
		Border brd= BorderFactory.createLineBorder(Color.red);
		
		lab.setHorizontalTextPosition(JLabel.CENTER);//set text left centre or right
		lab.setVerticalTextPosition(JLabel.TOP);// set text top centre or bottom
		
		lab.setForeground(new Color (0,0,255));					//font color
		lab.setFont(new Font("MV Boli",Font.ITALIC,25));		// font size and style
		
		lab.setIconTextGap(50); // can be negative numbers too
		
		lab.setBackground(Color.black); //set bg color	
		lab.setOpaque(true);  //display bg color
		
		lab.setBorder(brd);// border color
		
		lab.setVerticalAlignment(JLabel.CENTER);		// allignment
		lab.setHorizontalAlignment(JLabel.CENTER);
		
		//lab.setBounds(100, 100, 250, 250);
		//jf.setLayout(null);						//label positioning
		
		
		ImageIcon b=new ImageIcon("ab.jpg");
		lab.setIcon(b);
		
		jf.setVisible(true);
		//jf.setSize(550,500);
		jf.getContentPane().setBackground(new Color(255,255,255));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon logo=new ImageIcon("images.jpg");
		jf.setIconImage(logo.getImage());
		
		
		jf.pack();	//automatically gives dimensions and positioning
		
		
	}

}
