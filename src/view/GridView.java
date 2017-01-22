package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import model.map.Grid;

public class GridView {

	private Grid grid;

	public GridView(Grid grid) {
		this.grid = grid;
	}

	public void paint(Graphics g, Dimension dimension) {
		int tileWidth = (int) (dimension.getWidth() / grid.getWidth());
		int tileHeight = (int) (dimension.getHeight() / grid.getHeight());

		int borderThickness = tileWidth / 20;

		Graphics2D g2 = (Graphics2D) g.create();
		g2.setStroke(new BasicStroke(borderThickness));

		for (int y = 0; y < grid.getHeight(); y++) {
			for (int x = 0; x < grid.getWidth(); x++) {
				new TileView(grid.getTile(x, y)).paint(g2, tileWidth * x, tileHeight * y, tileWidth, tileHeight);

				g2.setColor(Color.BLACK);
				g2.drawRect(tileWidth * x, tileHeight * y, tileWidth, tileHeight);
			}
		}
	}

}
