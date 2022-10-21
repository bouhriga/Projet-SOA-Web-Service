package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
	private static Singleton uniqueInstance;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetsoa", "root","");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("Erreur de pilote : " + ex.getMessage());
		}
		catch(SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
			ex.printStackTrace();
		}
		return conn;
	}
}
