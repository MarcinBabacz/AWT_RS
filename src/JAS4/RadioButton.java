package JAS4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import testAWT.NewFrame;

public class RadioButton extends JFrame implements ActionListener {
	
	JButton b1;
	JLabel l1;
	JRadioButton r1,r2;

	
	
	public RadioButton(){
		
		
		NewFrame okno=new NewFrame("",300,500);
		
		
		
		r1=new JRadioButton("Mê¿czyzna");
		r1.setBounds(100, 50, 100, 30);
		okno.add(r1);
		
		r2=new JRadioButton("Kobieta");
		r2.setBounds(100, 100, 100, 30);
		okno.add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		
		b1=new JButton("Zatwierdz");
		b1.setBounds(100, 200, 100, 30);
		b1.addActionListener(this);
		okno.add(b1);
		
		l1=new JLabel("Kim jesteœ?");
		l1.setBounds(50, 250, 200, 30);
		okno.add(l1);
		
		
		
		okno.setVisible(true);
		
		
		
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		

		if(r1.isSelected()){
			
			l1.setText("Jesteœ : "+r1.getText());
			
		}else if(r2.isSelected()){
			l1.setText("Jesteœ : "+r2.getText());
			
		}else{
			
			l1.setText("Wybierz opcje wyboru");
		}
		
		
	}

}