package lab7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.List;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.*;

public class PlayersChooserFrame extends JFrame{
	public PlayersChooserFrame() {
		super("Players List");
		setSize(500,500);
		setLayout(new BorderLayout());
		
		
		
		createMenuBar();
		createToolbar();
		createListPanel();
		createButtonsListener();
		createToolBarListeners();
		
	}
	private DefaultListModel<String> playersModel, teamModel;
	private JList<String> playersList, teamList;
	private JButton takeButton, returnButton, takeAllButton, returnAllButton;
	private JPanel createButtonsPanel() {
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		buttonsPanel.setLayout(new GridLayout(4,0));
		takeButton = new JButton(">");
		takeButton.setToolTipText("Добавить выделенных игроков");
		takeAllButton=new JButton(">>");
		takeAllButton.setToolTipText("Добавить всех игроков");
		returnButton = new JButton("<");
		returnButton.setToolTipText("Вернуть выделенных игроков");
		returnAllButton = new JButton("<<");
		returnAllButton.setToolTipText("Вернуть всех игроков");
		buttonsPanel.add(takeButton);
		buttonsPanel.add(takeAllButton);
		buttonsPanel.add(returnButton);
		buttonsPanel.add(returnAllButton);
		return buttonsPanel;
	}
	private void createToolBarListeners() {
		saveButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent arg0) {
				String all = "";
				Enumeration<String> elements = teamModel.elements();
				while(elements.hasMoreElements()) {
					all+=elements.nextElement() + "\n";
				}
				JOptionPane.showMessageDialog(getParent(), all, 
						"Выбраны следующие игроки:", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamModel.removeAllElements();
				playersModel.removeAllElements();
				for (String player: PlayersBase.getPlayers()) {
					playersModel.addElement(player);
				}
			}
		});
		
	}

	private void createButtonsListener() {
		takeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				List<String> selection = playersList.getSelectedValuesList();
				for(String player:selection) {
					teamModel.addElement(player);
				}
				for(String player:selection) {
					playersModel.removeElement(player);
				}
			}
		});
		returnButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent arg0) {
				List<String> selection = teamList.getSelectedValuesList();
				for (String player :selection) {
					playersModel.addElement(player);
				}
				for(String player: selection) {
					teamModel.removeElement(player);
				}
			}
		});
		takeAllButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Enumeration<String> elements=playersModel.elements();
				while(elements.hasMoreElements()) {
					String next = elements.nextElement();
					teamModel.addElement(next);
				}
				playersModel.removeAllElements();
			}
		});
		returnAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Enumeration<String> elements = teamModel.elements();
				while(elements.hasMoreElements())
				{
					String next = elements.nextElement();
					playersModel.addElement(next);
				}
				teamModel.removeAllElements();
			}
		});
	}

	private void createListPanel() {
		playersModel = new DefaultListModel<String>();
		for (String player:PlayersBase.getPlayers()) {
			playersModel.addElement(player);
		}
		teamModel = new DefaultListModel<String>();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout());
		playersList = new JList<String>(playersModel);
		playersList.setToolTipText("Доступные игроки");
		playersList.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		teamList = new JList<String>(teamModel);
		teamList.setToolTipText("Выбранные игроки");
		teamList.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(playersList);
		panel.add(createButtonsPanel());
		panel.add(teamList);
		add(panel, BorderLayout.CENTER);
		
	}
	private JButton resetButton, saveButton;
	private void createToolbar() {
		saveButton = new JButton("save");
		resetButton = new JButton("reset");
		JPanel toolbar = new JPanel();
		toolbar.setLayout(new FlowLayout());
		toolbar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		toolbar.add(saveButton);
		toolbar.add(resetButton);
		add(toolbar,BorderLayout.NORTH);
		
	}

	private void createMenuBar() {
		JMenuBar menubar = new JMenuBar(); 
		setJMenuBar(menubar);
		JMenu filemenu= new JMenu("File");
		menubar.add(filemenu);
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0));
		exitItem.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(getParent(), "Вы точно хотите выйти?", "Подтвердить", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
				if(option==JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
			
			
		});
		
		filemenu.add(exitItem);
	}

}
