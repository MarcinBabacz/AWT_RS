package stoper;

import testAWT.NewFrame;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.Instant;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class Stoper implements ActionListener{
	
	JLabel l1,ls,ln,l_info,l_speed;
	Instant t_s,t_a;
	JButton b1,b2;
	JTextField t1;
	JList<String> list;
	DefaultListModel<String> li1;
	boolean test;
	
	
	
	public Stoper(){
		

		NewFrame win=new NewFrame("",600,500);
		
		t_s = Instant.now();
		
		
		
		l_info=new JLabel("Dystans: ");
		l_info.setBounds(50, 10, 100, 20);
		win.add(l_info);
		
		l_speed=new JLabel();
		l_speed.setBounds(150, 30, 300, 20);
		win.add(l_speed);
		
		t1=new JTextField();
		t1.setBounds(150, 10, 200, 20);
		win.add(t1);
		
		l1=new JLabel("W³acz stoper");
		l1.setFont(new Font("Calibr", Font.BOLD, 50));
		l1.setBounds(150, 50, 600, 100);
		win.add(l1);
		
		
	

		win.setVisible(true);
		
		b1=new JButton("Start");
		b1.setBounds(50,200, 200, 50);
		b1.addActionListener(this);
		win.add(b1);
		
		b2=new JButton("Miêdzyczas");
		b2.setBounds(300,200, 200, 50);
		b2.addActionListener(this);
		win.add(b2);
		

		li1 = new DefaultListModel<>();
		li1.addElement("");

		list = new JList<>(li1);
		list.setBounds(150,300, 200,200);
	
		
		win.add(list);
		
		while(true){	
			
			t_a = Instant.now();
	
			if(test){
				
				l1.setText(Duration.between(t_s, t_a).getSeconds()+"s "+(Duration.between(t_s, t_a).getNano())/1000000+" ms");
				win.repaint();
				
			}
			

			}
		

		
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
	
		
		Stoper stop =new Stoper();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(b1)){
			
			if(!test){
				b1.setText("Stop");
				test=true;
				t_s = Instant.now();
				li1.clear();
			}else{
				b1.setText("Start");
			
				
				int tmp= parseInt(t1.getText());
				float tmp2 =tmp/(Duration.between(t_s, t_a).getSeconds());
				System.out.println(parseInt(t1.getText()));
				System.out.println(Duration.between(t_s, t_a).getSeconds());
				
				l_speed.setText("Prêdkoœæ odcinka:");
				
				test=false;
				
			}
			
			
		}else if(e.getSource().equals(b2)){
			
			if(test){
			
				li1.addElement(Duration.between(t_s, t_a).getSeconds()+"s "+(Duration.between(t_s, t_a).getNano())/1000000+" ms");
				
			}else{
				
			}
			
			
		}
		
		
		
		
		
		
	}










	private int parseInt(String text) {
		// TODO Auto-generated method stub
		return 0;
	}

}
