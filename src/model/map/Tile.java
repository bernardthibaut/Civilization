package model.map;

import model.map.terrain.Terrain;

public class Tile {

	private Terrain terrain;
	
	public Tile(Terrain terrain){
		this.terrain = terrain;
	}
	
	public Terrain getTerrain() {
		return terrain;
	}
	
}
