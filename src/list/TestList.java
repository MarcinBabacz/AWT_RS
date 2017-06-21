package list;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import testAWT.NewFrame;

public class TestList extends JFrame implements ListSelectionListener {

	JList<String> list,list2;

	JLabel la1,la2;
	
	
	public TestList(){
		

		NewFrame win=new NewFrame("",400,500);
		
		
		
		DefaultListModel<String> l1 = new DefaultListModel<>();
		l1.addElement("");
		l1.addElement("Item2safdaswf");
		l1.addElement("Item3ada");
		l1.addElement("Item4asfdf");
		list = new JList<>(l1);
		list.setBounds(100,100, 75,75);
		list.addListSelectionListener(this);
		
		win.add(list);
		
		la1=new JLabel();
		la1.setBounds(50, 200, 300, 100);
		win.add(la1);
	
		win.setVisible(true);
		

	}
	

	
	public static void main(String[] args) {

		new TestList();

	}



	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		int i = list.getSelectedValue().length();
		
	
		
		la1.setText("Wybrano : "+list.getSelectedValue()+" ma d³ugoœæ "+i);
		
	}





	







}
