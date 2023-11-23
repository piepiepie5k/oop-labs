package lab4;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.JCheckBox;
import javax.swing.*;



public class window1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Окно для вывода информации");
		frame.setLocation(500,500);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,1));
		frame.add(panel, BorderLayout.SOUTH);
		
		JComboBox<String> box = new JComboBox<String>(chemestry.ELEMENTS);
		JTextArea area = new JTextArea();
		area.setText("Выберите элемент");
		area.setEditable(false);
		
		BoxListener listener=new BoxListener(box, area);
		box.addActionListener(listener);
		
		JCheckBox check = new JCheckBox("Выключить поля?");
		JTextField text = new JTextField("Введите текст:");
		JTextField moretext= new JTextField("введите еще что нибудь, просто почему бы и нет?");
		ButtonGroup group = new ButtonGroup();
		JRadioButton mrb=new JRadioButton("Мужчина");
		JRadioButton frb=new JRadioButton("Не мужчина");
		group.add(frb);
		group.add(mrb);
		panel.add(check);
		panel.add(text);
		panel.add(moretext);
		panel.add(frb);
		panel.add(mrb);
		CheckListener Clistener = new CheckListener();
		Clistener.components.add(text);
		Clistener.components.add(moretext);
		Clistener.components.add(frb);
		Clistener.components.add(mrb);
		check.addActionListener(Clistener);
		final JTextField word = new JTextField();
		final JTextField result = new JTextField();
		word.addCaretListener(new CaretListener() {
			@Override
			public void caretUpdate(CaretEvent arg0) {
				String str;
				if(word.getText().length()<5)
				{
					str="строка короткая, длина меньше 5";
				}
				else
				{
					if(word.getText().length()<10) {
						str="строка средняя, длина меньше 10";
					}
					else
					{
						str="строка длинная, длина от 10";
					}
				}
				
				result.setText(str);
			}
			
		});
		
		frame.add(word, BorderLayout.NORTH);
		frame.add(result, BorderLayout.CENTER);
		
		frame.add(box, BorderLayout.WEST);
		frame.add(area, BorderLayout.EAST);
		frame.setVisible(true);
		
		
		
		
		
	}
}
