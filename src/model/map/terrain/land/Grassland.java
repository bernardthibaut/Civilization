package model.map.terrain.land;

import view.terrainview.GrasslandView;
import view.terrainview.TerrainView;

public class Grassland extends Land {

	@Override
	public TerrainView createView() {
		return new GrasslandView();
	}

}
