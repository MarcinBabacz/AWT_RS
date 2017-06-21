package testAWT;

import javax.swing.JFrame;

public class NewFrame extends JFrame{
	
	
	public NewFrame (String title,int szerokosc,int wysokosc){
	
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
	}
	
	

}
