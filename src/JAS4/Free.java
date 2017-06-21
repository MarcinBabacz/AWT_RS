package JAS4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import testAWT.NewFrame;

public class Free extends JAS6 implements ActionListener{

	
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1;
	
	public Free (String text){
		
		
		
		NewFrame okno=new NewFrame("",500,500);
		
		//l3 = new JLabel(text); 
		//l3.setBounds(220, 0, 200, 30);
		//okno.add(l3);
		
		l1 = new JLabel(text); 
		l1.setBounds(0, 0, 200, 30);
		okno.add(l1);
		
		t1=new JTextField();
		t1.setBounds(0, 50, 200, 30);
		okno.add(t1);
		
		
		b1=new JButton("Zatwierdz");
		b1.setBounds(0, 100, 200, 30);
		b1.addActionListener(this);
		okno.add(b1);
	
		
		t2=new JTextField();
		t2.setBounds(0, 150, 200, 30);
		t2.addActionListener(this);
		okno.add(t2);
		

		
		okno.setVisible(true);

		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String tmp=t1.getText();
		t1.setText(t2.getText());
		t2.setText(tmp);
		
	}
	
	
	

}
