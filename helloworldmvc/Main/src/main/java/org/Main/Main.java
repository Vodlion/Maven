package org.Main;

import org.controller.Controller;
import org.model.Model;
import org.view.View;

public class Main {

	public static void main(String[] args) {
		View view = new View();
		Model model = new Model();
		Controller controller = new Controller(view, model);
		controller.run();
	}
}