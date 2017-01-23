package view.terrainview.featureview;

import java.awt.Graphics;

import model.map.terrain.land.Land;
import view.terrainview.LandView;
import view.terrainview.TerrainView;

public abstract class LandWithFeatureView extends LandView{

	protected TerrainView landView;
	
	public LandWithFeatureView(Land land) {
		this.landView = land.createView();
	}
	
	@Override
	public void paint(Graphics g, int x, int y, int width, int height) {
		landView.paint(g, x, y, width, height);
		g.drawImage(image.getImage(), x, y, width, height, null);
	}
	
}
