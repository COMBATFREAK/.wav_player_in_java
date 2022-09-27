package Gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class myFrame extends JFrame implements ActionListener{

	JButton p= new JButton();
	JButton q= new JButton();
	JButton r= new JButton();
	JButton s= new JButton();
	myFrame(){
		

		p.setBounds(0,0,100,100);
		p.addActionListener(this);
		p.setText("hello");
		p.setFocusable(false);
		
		q.setBounds(100,100,100,100);
		q.addActionListener(this);
		q.setText("hello");
		q.setFocusable(false);
		
		r.setBounds(200,200,100,100);
		r.addActionListener(this);
		r.setText("hello");
		r.setFocusable(false);
		
		s.setBounds(300,300,100,100);
		s.addActionListener(this);
		s.setText("hello");
		s.setFocusable(false);
		
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLayout(null);
		 this.setSize(500,500);
		 this.setVisible(true);
		 this.add(p);
		 this.add(q);
		 this.add(r);
		 this.add(s);
	}

		@Override
		public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==p) {
			System.out.println("p");
		}
		else if(e.getSource()==q) {
			System.out.println("q");
		}
		else if(e.getSource()==r) {
			System.out.println("r");
		}
		else if(e.getSource()==s) {
			System.out.println("s");
		}
	}
}
