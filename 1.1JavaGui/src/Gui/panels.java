package Gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panels {

	public static void main(String[] args) {
		
		JFrame jf=new JFrame();
		ImageIcon i=new ImageIcon("images.jpg");
		
		
		
		JLabel lab= new JLabel();
		lab.setText("Hi");
		lab.setIcon(i);
		
		JPanel redj=new JPanel();
		
		redj.setBackground(Color.red);
		redj.setBounds(0, 0, 100, 100);
		
 
		JPanel bluej=new JPanel();
		
		bluej.setBackground(Color.blue);
		bluej.setBounds(0, 0, 300, 300);
		
		JPanel greenj=new JPanel();
		
		greenj.setBackground(Color.green);
		greenj.setBounds(300, 0, 100, 300);
		
		
		
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.setLayout(null);
		jf.add(redj);				//remember to add panels	 
		jf.add(bluej);
		jf.add(greenj);
		
		bluej.add(lab);

	}

}
