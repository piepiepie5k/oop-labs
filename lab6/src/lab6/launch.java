package lab6;




import java.awt.GridLayout;
import javax.swing.*;

public class launch {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setLayout(new GridLayout());
		JTextArea panel = new JTextArea();
		hero hero = new hero(panel);
		frame.add(panel);
		frame.setVisible(true);
		
		
		ball ball1=new ball(panel,2,50,200,40);
		ball ball2=new ball(panel,10,10,100,50);
		ball ball3=new ball(panel,5,20,50,30);
		ball ball4=new ball(panel,3,30,150,20);
		
		ball1.start();
		ball2.start();
		ball3.start();
		ball4.start();
		
		hero.start();
	}

}


