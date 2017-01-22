package model.map;

import model.map.terrain.Terrain;

public class Tile {

	private Terrain terrain;

	public Tile() {
		terrain = Terrain.createRandomTerrain();
	}

	public Terrain getTerrain() {
		return terrain;
	}
	
}
