package org.model;

import org.contract.IModel;

public class Model implements IModel{

	private DAOHelloWorld dao;
	
	public Model(){
		dao = DAOHelloWorld.getInstance();
	}
	
	public String getHelloWorld() {
		return dao.getQuerySelectFirstHelloWorld();
	}

}
