package view.terrainview;

import javax.swing.ImageIcon;

public class DesertView extends LandView{

	@Override
	public ImageIcon getImageIcon() {
		return new ImageIcon("res/terrain/desert.png");
	}

}
