package model.map.terrain;

import view.terrainview.SeaView;
import view.terrainview.TerrainView;

public class Sea extends Terrain{

	@Override
	public TerrainView createView() {
		return new SeaView();
	}

	@Override
	public boolean isLand() {
		return false;
	}

}
