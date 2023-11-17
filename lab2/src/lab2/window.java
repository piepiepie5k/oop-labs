package lab2;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;


public class window {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350,350);
		frame.setLocation(0, 0);
		frame.setTitle("Кофе");
		frame.setVisible(true);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		final JTextArea text = new JTextArea("Количество Чашек: ", 0, 0);
		final JComboBox<String> amount = new JComboBox<String>(new String[] {"0","1","2","3"} );
		final JTextArea coffee = new JTextArea("Кофе: ", 0, 0);
		final JComboBox<String> type = new JComboBox<String>(new String[] {"Американо","Латте","Эспрессо","НЕКофе"} );
		final JTextArea marshmallow = new JTextArea("Добавить зефирки?", 0, 0);
		final JCheckBox mrs = new JCheckBox("Да");
		final JButton btn = new JButton("Итоговая сумма: ");
		final JTextArea sum = new JTextArea("    ", 0, 0);
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = 0;
				int am=0;
				if (amount.getSelectedItem().equals("0")) {
						am = 0;
				} else 
					if (amount.getSelectedItem().equals("1")) {
						am =1;		
						}
					else
					{
						if(amount.getSelectedItem().equals("2")) {
							am=2;
						}
						else {
							if(amount.getSelectedItem().equals("3"))
							{
								am=3;
							}
						}
					}
				if (type.getSelectedItem().equals("Американо")) {
					res = 100;
				} 
				else 
					if (type.getSelectedItem().equals("Латте")) {
						res = 110;
					}  
					else 
						if (type.getSelectedItem().equals("Эспрессо")) {
							res = 120;
						}
						else 
							if (type.getSelectedItem().equals("НЕКофе")) {
								res = 1000000000;
				}
				if (mrs.isSelected())
				{
					res=res+50;
				}	
				sum.setText(String.valueOf(res*am));
			}
			
			
		});
		
		
		frame.add(text);
		frame.add(amount);
		frame.add(coffee);
		frame.add(type);
		frame.add(marshmallow);
		frame.add(mrs);
		frame.add(btn);
		frame.add(sum);
	}}
