package lab8;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class Starter {

	public static void main(String[] args) {
		matrix matirx = new matrix();
		JPanel panel = new JPanel();
		DisplayMatrixListener dis = new DisplayMatrixListener();
		JTextArea matrixArea= new JTextArea();
		JFrame frame = new JFrame("Matrix");
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		JComboBox<String> combo = new JComboBox<String>();
		frame.add(combo, BorderLayout.NORTH);
		frame.add(matrixArea, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.EAST);
		for (IGenerator generator : MatrixData.generators) {
			combo.addItem(generator.getName());
		}
		matirx.setGenerator(new ZeroGen());
		for(IMatrixListener listener:MatrixData.listeners)
		{
			panel.add((JTextArea)listener);
			matirx.addListener(listener);
		}
		matirx.update();
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				matirx.setGenerator(MatrixData.generators[combo.getSelectedIndex()]);
				matirx.update();
				String text = "";
				for (int i = 0; i < matirx.getSize(); i++) {
					for (int j = 0; j < matirx.getSize(); j++) {
						text += matirx.getValue(i, j);
						text += " ";
					}
					text += "\n";
				}
				matrixArea.setText(text);
				
			}
		});
		frame.setVisible(true);
	}


}
