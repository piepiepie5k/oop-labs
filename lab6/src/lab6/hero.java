package lab6;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.JTextArea;

public class hero extends Thread {
	private final int UP=38;
	private final int DOWN=40;
	private final int LEFT=37;
	private final int RIGHT=39;
	private JTextArea panel; private Graphics gr;
	int step=5, x=20, y=120;
	public hero(JTextArea panel) {
		this.panel=panel;
	}
	private void moveUp() {y-=step;}
	private void moveDown() {y+=step;}
	private void moveLeft() {x-=step;}
	private void moveRight() {x+=step;}
	
	@Override
	public void run ()
	{
		gr=panel.getGraphics();
		gr.setColor(Color.GREEN);
		gr.fillRect(x, y, 20, 20);
		
		panel.addKeyListener(new KeyListener() {
			
			@Override
			public void keyPressed(KeyEvent event) {
				gr.setColor(Color.GRAY);
				gr.fillRect(x, y, 20, 20);
				switch(event.getKeyCode()) {
				case UP: moveUp(); break;
				case DOWN: moveDown(); break;
				case LEFT: moveLeft(); break;
				case RIGHT: moveRight(); break;
				
				}
				gr.setColor(Color.GREEN);
				gr.fillRect(x,y,20,20);
			}
			@Override
			public void keyTyped(KeyEvent arg0) {
				
			}
			@Override
			public void keyReleased(KeyEvent arg0) {
				
			}
			
		});
	}

}
