package view.terrainview.featureview;

import javax.swing.ImageIcon;

import model.map.terrain.land.Land;

public class MountainView extends LandWithFeatureView{

	public MountainView(Land land) {
		super(land);
	}

	@Override
	public ImageIcon getImageIcon() {
		return new ImageIcon("res/terrain/feature/mountain.png");
	}

}
