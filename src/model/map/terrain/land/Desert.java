package model.map.terrain.land;

import view.terrainview.DesertView;
import view.terrainview.TerrainView;

public class Desert extends Land{

	@Override
	public TerrainView createView() {
		return new DesertView();
	}

}
