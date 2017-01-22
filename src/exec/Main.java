package exec;

import controller.Controller;
import model.Model;
import view.View;

public class Main {

	public static void main(String[] args) {
		System.out.println("Starting");
		
		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(model, view);
				
	}
	
}
