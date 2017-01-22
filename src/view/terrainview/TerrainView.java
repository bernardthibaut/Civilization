package view.terrainview;

import java.awt.Color;
import java.awt.Graphics;

public abstract class TerrainView {

	public abstract Color getColor();
	
	public void paint(Graphics g, int x, int y, int width, int height) {
		g.setColor(getColor());
		g.fillRect(x, y, width, height);
	}
	
}
