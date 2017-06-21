package statusbar;



import java.time.Duration;
import java.time.Instant;

import javax.swing.*;
public class StatusBar extends JFrame {

	JProgressBar jb;
	JLabel l1;
	Instant t_s,t_a;
	int i=0,num=0;
		
	StatusBar(){
		
			setSize(250,150);
			setLayout(null);
			setLocationRelativeTo(null);
			
			t_s = Instant.now();
			
			jb=new JProgressBar(0,2000);
			jb.setBounds(40,40,160,30);
			jb.setValue(0);
			jb.setStringPainted(true);
		
			add(jb);
			
			l1=new JLabel();
			l1.setBounds(20, 70, 200, 30);
			add(l1);
			
		}
	
	
	
	public void iterate(){
		
		while(i<=2000){
			//t_a = Instant.now();
			//i=parseInt(Duration.between(t_s, t_a).getSeconds());
			
			l1.setText(Instant.now().toString());
			
			jb.setValue(i);
			i=i+20;
			
			if((i% 100)==0){
				
				//l1.setText("Wykonuje zadanie: "+(i/100)+"/"+2000/100);

			}

			try{Thread.sleep(150);}catch(Exception e){}
		}
		
		l1.setText("Zadanie wykonane");
	}



	public static void main(String[] args) {

		StatusBar m=new StatusBar();
		m.setVisible(true);
		m.iterate();
	}
}