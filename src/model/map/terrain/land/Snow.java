package model.map.terrain.land;

import view.terrainview.SnowView;
import view.terrainview.TerrainView;

public class Snow extends Land{

	@Override
	public TerrainView createView() {
		return new SnowView();
	}

}
