package model.map.terrain;

import java.util.Random;

import model.map.terrain.land.Desert;
import model.map.terrain.land.Grassland;
import model.map.terrain.land.Land;
import model.map.terrain.land.Snow;
import model.map.terrain.land.feature.Hills;
import view.terrainview.TerrainView;

public abstract class Terrain {

	public abstract TerrainView createView();

	public static Terrain createRandomTerrain() {
		Random r = new Random();
		Terrain result;

		switch (r.nextInt(4)) {
		case 0:
			result = new Desert();
			break;
		case 1:
			result = new Snow();
			break;
		default:
			result = new Grassland();
			break;
		}

		switch (r.nextInt(4)) {
		case 0:
			result = new Hills((Land) result);
			break;
		}

		return result;
	}

}
