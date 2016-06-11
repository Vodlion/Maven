package org.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOHelloWorld {
	
	private static DAOHelloWorld instance;
	private final static String LOGIN = "root";
	private final static String URL = "jdbc:mysql://localhost:3306/maven?autoReconnect=true&useSSL=false";
	private final static String PASSWORD = "";
	
	private Connection connection;
	private Statement statement;
	
	private DAOHelloWorld(){
		this.connection = null;
		this.statement = null;
	}
	
	public static DAOHelloWorld getInstance(){
		if(instance == null)
			instance = new DAOHelloWorld();
		return instance;
	}
	
	public String getQuerySelectFirstHelloWorld(){
		String result = "";
		ResultSet rs;
		open();
		rs = executeQuery("SELECT * FROM coucou");
		try {
			rs.next();
			result = rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			return result;
		}
	}
	
	protected void close(){
		this.connection = null;
		this.statement = null;
	}
	
	protected Boolean open(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(this.URL, this.LOGIN, this.PASSWORD);
			this.statement = this.connection.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	protected ResultSet executeQuery(String query){
		try {
			ResultSet rs = statement.executeQuery(query);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

}
