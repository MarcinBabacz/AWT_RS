package testAWT;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class First implements ActionListener{
	
	static JButton butt_1,butt_2;
	static JLabel l1,l2;
	static JTextField t1,t2;
	
	public static void main(String[] args) {

		NewFrame okno=new NewFrame("",500,500);
		First butt =new First();
		JTextField t1,t2;
		
		
		l1= new JLabel(" OK/ NOK"); 
		l1.setBounds(150,150 , 200, 25);

		
		l2= new JLabel("TAK NIE"); 
		l2.setBounds(150,250 , 200, 25);
		
		okno.add(l1);
		okno.add(l2);
		
		
		butt_1=new JButton();
		butt_1.setText("OK");
		
		butt_2=new JButton();
		butt_2.setText("TAK");
		
		
		
		butt_1.addActionListener(butt);
		butt_1.setBounds(150, 180, 200, 30);
		
		butt_2.addActionListener(butt);
		butt_2.setBounds(150, 280, 200, 30);

		
		okno.add(butt_1);
		okno.add(butt_2);
		
		t1=new JTextField("asfsafsd");
		t1.setBounds(0, 0, 100,30);
		
		
		
		
		okno.add(t1);
	
		

		
		okno.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent l) {
		
	if(l.getSource().equals(butt_1)){
		
		if(butt_1.getText().equals("OK")){
			butt_1.setText("NOK");
			l1.setText("Zamieñ NOK na OK");
			
		}else{
			butt_1.setText("OK");
			l1.setText("Zamieñ OK na NOK");
			
		}
		
	}else if(l.getSource().equals(butt_2)){
		

		if(butt_2.getText().equals("TAK")){
			butt_2.setText("NIE");
			l2.setText(t1.getText());
		}else{
			butt_2.setText("TAK");
			l2.setText("Zamieñ TAK na NIE");
			
		}	
		
		
	}else if(l.getSource().equals(t1)){
		
			
		
	}
	
		
		
		
		
		
	}
}