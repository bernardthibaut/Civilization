package view;

import java.awt.Graphics;

import model.map.Tile;

public class TileView {

	private Tile tile;

	public TileView(Tile tile) {
		this.tile = tile;
	}

	public void paint(Graphics g, int x, int y, int width, int height) {
		if (tile != null)
			tile.getTerrain().createView().paint(g, x, y, width, height);
	}

}
