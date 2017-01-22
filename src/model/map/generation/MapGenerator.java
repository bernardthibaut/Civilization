package model.map.generation;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import model.map.Grid;
import model.map.Tile;
import model.map.terrain.Sea;
import model.map.terrain.land.Desert;
import model.map.terrain.land.Grassland;
import model.map.terrain.land.Land;
import model.map.terrain.land.Snow;

public abstract class MapGenerator {

	public static void createContent(Grid grid) {
		ArrayList<Point> centerPoints = initCenterPoints(grid);
		initTiles(grid, centerPoints);
	}

	private static ArrayList<Point> initCenterPoints(Grid grid) {
		ArrayList<Point> centerPoints = new ArrayList<Point>();
		int totalTiles = grid.getHeight() * grid.getWidth();
		int nbCenterPoints = totalTiles / Math.min(grid.getHeight(), grid.getWidth());

		System.out.println(nbCenterPoints);

		Random r = new Random();
		for (int i = 0; i < nbCenterPoints; i++) {
			int x = r.nextInt(grid.getWidth());
			int y = r.nextInt(grid.getHeight());

			if (grid.getTile(x, y) == null) {
				centerPoints.add(new Point(x, y));
				createRandomTerrain(grid, x, y);
			} else
				i--;
		}

		return centerPoints;
	}

	private static void initTiles(Grid grid, ArrayList<Point> centerPoints) {
		for (int x = 0; x < grid.getWidth(); x++) {
			for (int y = 0; y < grid.getHeight(); y++) {
				Point closestCenterPoint = getClosestCenterPoint(x, y, centerPoints);
				Tile tile = grid.getTile(closestCenterPoint.x, closestCenterPoint.y);
				grid.setTile(x, y, tile);
			}
		}
	}

	private static Point getClosestCenterPoint(int x, int y, ArrayList<Point> centerPoints) {
		Point closestPoint = null;
		int minRange = -1;

		for (Point point : centerPoints) {
			int xRange = Math.abs(x - point.x);
			int yRange = Math.abs(y - point.y);
			int range = (int) Math.sqrt(Math.pow(xRange, 2) + Math.pow(yRange, 2));
			if (range < minRange || minRange == -1) {
				minRange = range;
				closestPoint = point;
			}
		}

		return closestPoint;
	}

	private static void createRandomTerrain(Grid grid, int x, int y) {
		Random r = new Random();

		switch (r.nextInt(2)) {
		case 0:
			createRandomLand(grid, x, y);
			break;
		default:
			grid.setTile(x, y, new Tile(new Sea()));
			break;
		}

	}

	private static void createRandomLand(Grid grid, int x, int y) {
		Random r = new Random();

		switch (r.nextInt(4)) {
		case 0:
			int polarRegionHeight = grid.getHeight() / 6;
			if (y <= polarRegionHeight || y >= grid.getHeight() - polarRegionHeight)
				grid.setTile(x, y, new Tile(new Snow()));
			else
				grid.setTile(x, y, new Tile(new Desert()));
			break;
		default:
			grid.setTile(x, y, new Tile(new Grassland()));
			break;
		}

	}

}
