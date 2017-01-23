package model.map.terrain.land.feature;

import model.map.terrain.land.Land;
import view.terrainview.TerrainView;
import view.terrainview.featureview.MountainView;

public class Mountain extends LandWithFeature{

	public Mountain(Land land) {
		super(land);
	}

	@Override
	public TerrainView createView() {
		return new MountainView(land);
	}

}
