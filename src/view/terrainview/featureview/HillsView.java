package view.terrainview.featureview;

import javax.swing.ImageIcon;

import model.map.terrain.land.Land;

public class HillsView extends LandWithFeatureView{

	public HillsView(Land land) {
		super(land);
	}

	@Override
	public ImageIcon getImageIcon() {
		return new ImageIcon("res/terrain/feature/hills.png");
	}


}
