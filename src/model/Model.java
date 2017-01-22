package model;

import java.util.Observable;

import model.map.Grid;

public class Model extends Observable {

	private Grid grid;

	public Model() {
		grid = new Grid(10, 10);
	}
	
	public Grid getGrid() {
		return grid;
	}
	
	public void resizeGrid(int width, int height){
		grid = new Grid(width, height);
		setChanged();
		notifyObservers();
	}

}
