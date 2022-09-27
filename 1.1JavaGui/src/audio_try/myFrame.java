package audio_try;
import java.awt.Color;

import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class myFrame extends JFrame implements ActionListener {
	
	String[] songs= new String[20];
	int counter=0;
	Clip c;
	File f;
	AudioInputStream AS;
	
	ImageIcon icon= new ImageIcon("C:\\Users\\Dell\\Downloads\\icon\\player.png");
	
	JButton p= new JButton();
	JButton q= new JButton();
	JButton r= new JButton();
	JButton s= new JButton();
	JButton l=new JButton();
	
	
	JTextField sgtf= new JTextField();
	JTextField sgnm= new JTextField();
	
	JComboBox history;
	

	myFrame(){
		
		sgtf.setBounds(275, 100,300, 50);
		sgtf.setFont(new Font("Consolas",Font.CENTER_BASELINE,17));
		sgtf.setBackground(Color.gray);
		sgtf.setText("Please select a .wav file only");	
		
		sgnm.setBounds(275, 200,300, 50);
		sgnm.setBackground(Color.gray);
		
		
		l.setBounds(0,0,150,125);
		l.addActionListener(this);
		l.setText("Load");
		l.setFocusable(false);
		
		p.setBounds(0,125,150,125);
		p.addActionListener(this);
		p.setText("Play");
		p.setFocusable(false);
		p.setEnabled(false);
		
		
		q.setBounds(0,250,150,125);
		q.addActionListener(this);
		q.setText("Pause");
		q.setFocusable(false);
		q.setEnabled(false);
		
		
		r.setBounds(0,375,150,125);
		r.addActionListener(this);
		r.setText("Restart");
		r.setFocusable(false);
		r.setEnabled(false);
		
		
		s.setBounds(0,500,150,125);
		s.addActionListener(this);
		s.setText("Stop");
		s.setFocusable(false);
		s.setEnabled(false);
		
		history= new JComboBox(songs);
		history.addActionListener(this);
		history.setBounds(275,50,300,40);
		history.setVisible(true);
		
		
		 this.setResizable(false);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLayout(null);
		 this.setSize(750,660);
		 this.setVisible(true);
		 this.add(p);
		 this.add(q);
		 this.add(r);
		 this.add(s);
		 this.add(l);
		 this.add(sgtf);
		 this.add(sgnm);
		 this.add(history);
		 this.setIconImage(icon.getImage());
		 this.getContentPane().setBackground(new Color(0,77,92));
		 this.setTitle("Audio Player");
	
		 
	}

		@Override
		public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==p) {
		c.start();		
		
		sgtf.setBackground(Color.green);
		sgtf.setFont(new Font("Consolas",Font.CENTER_BASELINE,20));
		
		sgtf.setText("   The song is playing");
		}
		if(e.getSource()==q) {
			c.stop();
		sgtf.setBackground(Color.orange);
		sgtf.setFont(new Font("Consolas",Font.CENTER_BASELINE,20));
		sgtf.setText("    The song is paused");
		}
		if(e.getSource()==r) {
			c.setMicrosecondPosition(0);
			c.start();
			sgtf.setBackground(Color.green);
			sgtf.setFont(new Font("Consolas",Font.CENTER_BASELINE,20));
			sgtf.setText("   The song has restarted");
			
			p.setEnabled(true);
			q.setEnabled(true);
		}
		if(e.getSource()==s) {
			c.stop();
			c.setMicrosecondPosition(0);
			
			sgtf.setBackground(Color.red);
			sgtf.setFont(new Font("Consolas",Font.CENTER_BASELINE,17));
			sgtf.setText(" Audio Player has been stopped");
			
			p.setEnabled(false);
			q.setEnabled(false);
			r.setEnabled(false);
			s.setEnabled(false);
			
			sgnm.setText("	Terminated");
		
		}
		
		if(e.getSource()==l) {
			sgtf.setFont(new Font("Consolas",Font.CENTER_BASELINE,17));
			sgtf.setBackground(Color.gray);
			sgtf.setText("Please select a .wav file only");	
			
			JFileChooser jf= new JFileChooser();
			
			int response= jf.showOpenDialog(null);
			
			if(response== JFileChooser.APPROVE_OPTION) {
				
				File temp=new File(jf.getSelectedFile().getAbsolutePath());
				
				f=temp;
				
				
				try {
					AS= AudioSystem.getAudioInputStream(f);
					c=AudioSystem.getClip();
					c.open(AS);
				} catch (UnsupportedAudioFileException | IOException e2) {
					e2.printStackTrace();
				} catch (LineUnavailableException e1) {
					e1.printStackTrace();
				}
				
				p.setEnabled(true);
				q.setEnabled(true);
				r.setEnabled(true);
				s.setEnabled(true);
				
				
				sgnm.setBackground(new Color(138,43,226));
				sgnm.setFont(new Font("Consolas",Font.CENTER_BASELINE,20));
				sgnm.setText("Current song "+ f.getName());
				
				
			}
			
		}
		
		if(e.getSource()==history) {
			
			
		}
		
		
		
	}
}


