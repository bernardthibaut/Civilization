package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Model;

@SuppressWarnings("serial")
public class View extends JFrame implements Observer {

	private Model model;
	private JPanel mainPanel;
	
	public View(Model model) {
		this.model = model;
		model.addObserver(this);
		
		mainPanel = new GamePanel(model);
		add(mainPanel, BorderLayout.CENTER);
		
		mainPanel.setPreferredSize(new Dimension(800, 800));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public JPanel getMainPanel() {
		return mainPanel;
	}

	@Override
	public void update(Observable o, Object arg) {
		mainPanel.repaint();
	}

}
