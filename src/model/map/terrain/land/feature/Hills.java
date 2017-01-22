package model.map.terrain.land.feature;

import model.map.terrain.land.Land;
import view.terrainview.TerrainView;
import view.terrainview.featureview.HillsView;

public class Hills extends LandWithFeature{

	public Hills(Land land) {
		super(land);
	}
	
	public TerrainView createView() {
		return new HillsView(land);
	}

}
