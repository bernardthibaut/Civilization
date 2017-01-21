package model;

public class Grid {

	private Tile[][] content;
	
	public Grid(int width, int height) {
		content = new Tile[width][height];
	}
	
	public Tile getTile(int x, int y){
		return content[x][y];
	}
	
}
