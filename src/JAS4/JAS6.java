package JAS4;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import testAWT.NewFrame;

public class JAS6 implements ActionListener{

	JLabel l1,l2;
	JPasswordField p1;
	JTextField t1;
	
	
	public JAS6(){

	NewFrame okno=new NewFrame("",300,500);
	
	
	l1 = new JLabel("Podaj Text i Has³o dostêpu"); 
	l1.setBounds(50, 0, 200, 30);
	okno.add(l1);
	
	t1=new JTextField();
	t1.setBounds(50, 50, 200, 30);
	okno.add(t1);
	
	p1=new JPasswordField();
	p1.setBounds(50, 150, 200, 30);
	p1.addActionListener(this);
	okno.add(p1);
	
	
	JButton b1=new JButton("Zatwierdz");
	b1.setBounds(50, 200, 200, 30);
	b1.addActionListener(this);
	okno.add(b1);

	
	l2=new JLabel();
	l2.setBounds(50, 250, 200, 30);
	okno.add(l2);
	

	
	okno.setVisible(true);
	
	
	
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String tmp= new String(p1.getPassword());
	
		
		if(tmp.equals("test")){
			
			l2.setText(t1.getText()+" poda³eœ Poprane Has³o");
			
			Free okno1 = new Free("Brawo "+t1.getText());
			
			
			
		}else{
			l2.setText("B³êdne has³o");
			
		}
		
		
		
	}


	
	
	
	

}
