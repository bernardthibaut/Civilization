package model.map;

import model.map.generation.MapGenerator;

public class Grid {

	private Tile[][] content;
	private final int width;
	private final int height;

	public Grid(int width, int height) {
		content = new Tile[width][height];
		this.width = width;
		this.height = height;
		
		MapGenerator.createContent(this);
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Tile getTile(int x, int y) {
		return content[x][y];
	}
	
	public void setTile(int x, int y, Tile tile){
		content[x][y] = tile;
	}

}
