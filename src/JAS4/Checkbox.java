package JAS4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


import testAWT.NewFrame;

public class Checkbox extends JFrame implements ActionListener {

	JCheckBox c1,c2;
	JLabel l1;
	String tmp = "";
	
	
	public Checkbox(){
		
		
		
		NewFrame okno=new NewFrame("",300,500);
		
		
		c1 = new JCheckBox("C++");
		c1.setBounds(100,100, 150,50);
		okno.add(c1);
		
		c2 = new JCheckBox("Java", true);
		c2.setBounds(100,150, 150,50);
		okno.add(c2);
		
		JButton b1=new JButton("Zatwierdz");
		b1.setBounds(100, 200, 100, 30);
		b1.addActionListener(this);
		okno.add(b1);
		
		l1=new JLabel("test");
		l1.setBounds(100, 250, 100, 30);
		okno.add(l1);
		
		
		
		okno.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		tmp="";
	
	
		if(c1.isSelected()){

			tmp+=c1.getText();
			
		}
		
		if(c2.isSelected()){
			
			tmp+=c2.getText();
			
			
		}else{
			
			tmp=("NIC NIE ZAZNACZONO");
		}
		
		l1.setText(tmp);
		
		
	}
	

}
