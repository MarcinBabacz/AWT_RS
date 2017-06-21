package jas20;

import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class JAS20 extends JFrame implements ChangeListener  {

	JSlider slider;
	JSpinner sp1;
	JLabel l1;

public JAS20() {
	slider = new JSlider(JSlider.VERTICAL, 0, 100, 40);
	slider.setMinorTickSpacing(2);
	slider.setMajorTickSpacing(10);
	slider.setPaintTicks(true);
	slider.setPaintLabels(true);
	JPanel panel=new JPanel();
	panel.add(slider);
	panel.setBounds(100,30, 100, 200);
	slider.addChangeListener(this);
	slider.setToolTipText("koniec zajêæ");
	add(panel);
	
	SpinnerModel value =new SpinnerNumberModel(5,0,10,1);
	
	

	
	
	
}public static void main(String s[]) {
	JAS20 frame=new JAS20();
frame.pack();
frame.setSize(700, 800);
frame.setLocationRelativeTo(null);
frame.setVisible(true);
}

@Override
public void stateChanged(ChangeEvent e) {
	int tmp=slider.getValue();
	
	l1.setText(""+tmp);
	
}
}