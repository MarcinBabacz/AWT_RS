package okienka;
import java.awt.Font;

import javax.swing.*;

import testAWT.NewFrame;

public class JDialog extends JFrame {
	
	JFrame f;
	JLabel l1;
	
	JDialog(){
		
		
		NewFrame win=new NewFrame("",600,500);
		
		win.setVisible(true);
		//JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");
	//	JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",
		//JOptionPane.WARNING_MESSAGE);
		String name=JOptionPane.showInputDialog(f,"Enter Name");
		
		//System.out.println(name);
		l1=new JLabel();
		l1.setBounds(50, 100, 400, 100);
		if(name.equals("Marcin")){
			
			l1.setText("Czeœæ: " +name+" jesteœ kozak programowania");
		}else{
			
			l1.setText("Czeœæ: " +name+" jeszcze musisz siê du¿o nauczyæ");
		}
		
		
		l1.setFont(new Font("Calibr", Font.BOLD, 15));
		win.add(l1);
		
		
		win.repaint();
	}

	
	
	
	public static void main(String[] args) {
		JDialog dial1=new JDialog();

	}

}
