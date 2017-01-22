package view;

import java.awt.Graphics;

import javax.swing.JPanel;

import model.Model;

@SuppressWarnings("serial")
public class GamePanel extends JPanel{

	private Model model;
	
	public GamePanel(Model model) {
		this.model = model;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		new GridView(model.getGrid()).paint(g, getSize());
	}
	
}
