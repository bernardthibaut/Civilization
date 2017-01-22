package model.map.terrain.land.feature;

import model.map.terrain.land.Land;

public abstract class LandWithFeature extends Land{
	
	protected Land land;
	
	public LandWithFeature(Land land) {
		this.land = land;
	}
	
}
