package popup;


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class PopUp extends JFrame implements ActionListener,MouseListener {

	
	JButton b;
	JLabel l1,l2,l3;
	Container c;
	Color cl1,cl2,cl3;
	PopUp(){
		
		
		setSize(400,400);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l1=new JLabel("TEST 1");
		l1.setBounds(50, 50, 200, 200);
		cl1=Color.black;
		l1.setForeground(cl1);
		l1.addMouseListener(this);
		add(l1);
		

		l2=new JLabel("TEST 2");
		l2.setBounds(50, 150, 200, 30);

		cl2=Color.black;
		l2.setForeground(cl2);
		l2.addMouseListener(this);
		
		add(l2);
		
		l3=new JLabel("TEST 3");
		l3.setBounds(50, 200, 200, 30);

		cl3=Color.black;
		l3.setForeground(cl3);
		l3.addMouseListener(this);
		add(l3);
		
		
		
		
		c=getContentPane();
		c.setLayout(new FlowLayout());
		b=new JButton("color");
		b.addActionListener(this);
		c.add(b);
	
	
	
	
		setVisible(true);
	
	
	
	
	
	}
	
	public void actionPerformed(ActionEvent e) {
		Color initialcolor=Color.RED;
		Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);
		
		c.setBackground(color);
		
		
		
		
	}
	
	
	
	public static void main(String[] e) {
		
		
		
		PopUp ch=new PopUp();
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		arg0.bu
		
	}

	@Override
	public void mouseEntered(MouseEvent f) {
		
		
		if(f.getSource().equals(l1)){

			l1.setForeground(Color.RED);
			
		}else if(f.getSource().equals(l2)){
			
			l2.setForeground(Color.BLUE);
			
		}else if(f.getSource().equals(l3)){
			
			l3.setForeground(Color.GREEN);
			
		}
		
	}

	@Override
	public void mouseExited(MouseEvent g) {
		
	
		
		
		
		if(g.getSource().equals(l1)){

			l1.setForeground(cl1);
			
		}else if(g.getSource().equals(l2)){
			
			l2.setForeground(cl2);
			
		}else if(g.getSource().equals(l3)){
			
			l3.setForeground(cl3);
			
		}
	
	
		
		
		
	}

	@Override
	public void mousePressed(MouseEvent z) {


		Color initialcolor=Color.RED;
		Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);
		
		

		if(z.getSource().equals(l1)){
			cl1=color;
			l1.setForeground(cl1);
			
		}else if(z.getSource().equals(l2)){
			
			cl2=color;
			l2.setForeground(cl2);
			
		}else if(z.getSource().equals(l3)){
			cl3=color;
			l3.setForeground(cl3);
			
		}
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}


