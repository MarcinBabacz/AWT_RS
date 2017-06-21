package suwak;

import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Suwak extends JFrame implements ChangeListener  {

	JSlider slider;
	JLabel l1;

public Suwak() {
	slider = new JSlider(JSlider.VERTICAL, 0, 100, 40);
	slider.setMinorTickSpacing(2);
	slider.setMajorTickSpacing(10);
	slider.setPaintTicks(true);
	slider.setPaintLabels(true);
	JPanel panel=new JPanel();
	panel.add(slider);
	panel.setBounds(100,30, 100, 200);
	slider.addChangeListener(this);
	add(panel);
	
	l1=new JLabel("sdg");
	l1.setBounds(50, 150, 100, 20);
	add(l1);
	
	
	
}public static void main(String s[]) {
	Suwak frame=new Suwak();
frame.pack();
frame.setSize(300, 400);
frame.setLocationRelativeTo(null);
frame.setVisible(true);
}

@Override
public void stateChanged(ChangeEvent e) {
	int tmp=slider.getValue();
	
	l1.setText(""+tmp);
	
}
}