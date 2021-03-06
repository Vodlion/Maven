package org.controller;

import org.contract.IModel;
import org.contract.IView;

public class Controller {

	private IModel model;
	private IView view;
	
	public Controller(final IView view, final IModel model){
		this.view = view;
		this.model = model;
	}
	
	public void run(){
		this.view.displayMessage(this.model.getHelloWorld());
	}
	
}
