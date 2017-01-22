package model;

import java.util.Observable;

import model.map.Grid;

public class Model extends Observable {

	private final int WIDTH = 100;
	private final int HEIGHT = 100;
	private Grid grid;

	public Model() {
		grid = new Grid(WIDTH, HEIGHT);
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
