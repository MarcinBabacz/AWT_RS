package table;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JAS12 extends JFrame{
	JFrame f;
	JTable jt;
	JScrollPane sp;
	
	
	String data[][]={ 
			{"1","Amit","AAA","6700,00"},
			{"2","Jai","BBB","7800,00"},
			{"3","Sachin","CCC","7000,00"}};
	
	String column[]={"ID","Imie","Nazwisko","Zarobki"};	
	
	
		JAS12(){

			f=new JFrame();
			f.setSize(500,600);
			f.setLocationRelativeTo(null);


			jt=new JTable(data,column);
			jt.setBounds(30,40,300,300);
			sp=new JScrollPane(jt);
			
			f.add(sp);
					
			f.setVisible(true);
			
		}

	public static void main(String[] args) {
		
		new JAS12();
	}
}
