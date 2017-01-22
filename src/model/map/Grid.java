package model.map;

public class Grid {

	private Tile[][] content;
	private final int width;
	private final int height;

	public Grid(int width, int height) {
		content = new Tile[width][height];
		this.width = width;
		this.height = height;

		generateContent();
	}

	public void generateContent() {
		for (int x = 0; x < getWidth(); x++) {
			for (int y = 0; y < getHeight(); y++) {
				content[x][y] = new Tile();
			}
		}
	}

	public Tile[][] getContent() {
		return content;
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
	
}
