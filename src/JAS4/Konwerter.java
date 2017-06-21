package JAS4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import testAWT.NewFrame;

public class Konwerter extends JFrame implements ActionListener {
	
	JComboBox c1;
	JButton b1;
	JLabel l1,l2;
	JTextField t1;
	int input;
	
	public Konwerter(){
		
		

		NewFrame okno=new NewFrame("",400,500);
		
	
		
		l1=new JLabel("Wpisz wartoœæ i wybiersz kontertowanie: ");
		l1.setBounds(50, 50, 300, 30);
		okno.add(l1);
		
		t1=new JTextField();
		t1.setBounds(50, 100, 200, 30);
		okno.add(t1);
		
		
		String[] panstwa={"C===>F","F===>C"};
		
		c1=new JComboBox(panstwa);
		c1.setBounds(100, 150, 100, 30);
		c1.addActionListener(this);
		okno.add(c1);

		b1=new JButton("Konwertuj");
		b1.setBounds(100, 200, 100, 30);
		b1.addActionListener(this);
		okno.add(b1);
		
		
		l2=new JLabel("Kim jesteœ?");
		l2.setBounds(50, 250, 300, 30);
		okno.add(l2);
		
		
		
		okno.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		String tmp =c1.getSelectedItem().toString();
		
		
	if(!t1.getText().equals("")){
		
	
	
		 try { 
			 
			 input=(Integer.parseInt(t1.getText()));
			 
		    } catch(NumberFormatException e1) { 
		    	l2.setText("Wpisz poprawn¹ liczbe");
		    	
		    
		    
		    
		    } catch(NullPointerException e1) {
		    	l2.setText("Wpisz poprawn¹ liczbe");
		   
		    
		    
		    }
		
		
			
			if(tmp.equals("C===>F")){

				l2.setText(t1.getText()+" stopni Celsjusza to: "+(input*8/5+32)+" stopnie Farenheta");
			
			}else if(tmp.equals("F===>C")){

				l2.setText(t1.getText()+" stopni Celsjusza to: "+((input-32)*8/5+32)+" stopnie Farenheta");
				
			
				
			
			}
			
	
	
		
		
		
		
		
	}else{
		l2.setText("Wpisz poprawn¹ liczbe");
		
	}
		
	}
	
	
	

}
