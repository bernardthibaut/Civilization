package view.terrainview.featureview;

import java.awt.Color;
import java.awt.Graphics;

import model.map.terrain.land.Land;

public class HillsView extends LandWithFeatureView{

	public HillsView(Land land) {
		super(land);
	}

	@Override
	public void paintFeature(Graphics g, int x, int y, int width, int height) {
		g.setColor(Color.black);
		g.drawArc(x + width / 4, y + height / 4, width / 2, height / 2, 45, 100);
		g.drawArc(x + width / 2, y + height / 2, width / 3, height / 3, 50, 90);
	}


}
