package model.map.terrain.land;

import model.map.terrain.Terrain;

public abstract class Land extends Terrain{
	
	@Override
	public boolean isLand() {
		return true;
	}
	
}
