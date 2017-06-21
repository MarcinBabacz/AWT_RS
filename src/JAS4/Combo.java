package JAS4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import testAWT.NewFrame;

public class Combo extends JFrame implements ActionListener {
	
	JComboBox c1;
	JButton b1;
	JLabel l1;

	public Combo (){
		
		NewFrame okno=new NewFrame("",300,500);
		
		String[] panstwa={"POL","GER","AUT"};
		
		c1=new JComboBox(panstwa);
		c1.setBounds(100, 50, 100, 30);
		c1.addActionListener(this);
		okno.add(c1);

		
		
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
	l1.setText("Jesteœ : "+c1.getSelectedItem().toString());
		
	}

}
