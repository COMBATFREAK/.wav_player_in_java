package Gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jframe {

	public static void main(String[] args) {
	

		
		JFrame jf=new JFrame(); // creates new frame
		
		jf.setSize(500,500);	// sets x and  y dimension of frame
		
		jf.setTitle("First try");	//sets title
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application , another opt is do_nthng_on_close
		
		jf.setResizable(false);  // does not allow to resize the window
		
		ImageIcon lg= new ImageIcon("images.jpg"); // create an image icon
		jf.setIconImage(lg.getImage()); //create logo
		
		jf.setVisible(true); //visible to user
		
		jf.getContentPane().setBackground(new Color(69,30,199)); //change bg color )range is from 0 to 255)RGB values or can use
															//color.blue etc;
		
		
		
		//myFrame mf= new myFrame();
		
	}

}