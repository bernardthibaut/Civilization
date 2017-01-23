package view.terrainview;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public abstract class TerrainView {

	protected ImageIcon image;
	
	public TerrainView() {
		image = getImageIcon();
	}
	
	public abstract ImageIcon getImageIcon();
	
	public void paint(Graphics g, int x, int y, int width, int height) {
		g.drawImage(image.getImage(), x, y, width, height, null);
	}
	
}
