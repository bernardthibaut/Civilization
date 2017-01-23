package view.terrainview;

import javax.swing.ImageIcon;

public class SeaView extends TerrainView {

	@Override
	public ImageIcon getImageIcon() {
		return new ImageIcon("res/terrain/sea.png");
	}

}
