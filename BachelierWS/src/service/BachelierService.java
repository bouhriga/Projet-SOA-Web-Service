package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Bachelier;
@WebService(name="BachelierService")
public class BachelierService {
	 BachelierService c;
@WebMethod
	public boolean findOne(@WebParam(name="cin") String cin,@WebParam(name="numetud") String numetud) {
		boolean b = false;
		try {

			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM bacheliers WHERE cin = ? and numetud=? ");
			stmt.setString(1, cin);
			stmt.setString(2, numetud);
			ResultSet result = stmt.executeQuery();
			if (result.next()) {
				int id = result.getInt("id");
				double notemath = result.getDouble("notemath");
				double notephys = result.getDouble("notephys");
				double notearabe = result.getDouble("notearabe");
				double noteanglais = result.getDouble("noteanglais");
				String nomprenom = result.getString("nomprenom");

				if(notemath > 12 && notephys > 12 && notearabe > 12 && noteanglais > 12) {
					b = true;
					PreparedStatement stm = conn.prepareStatement("INSERT INTO resultat VALUES (NULL, ?, ?, ?)");
					stm.setString(1,cin);
					stm.setString(2,numetud );
					stm.setString(3,nomprenom);
					stm.execute();
				}
			}
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
		return b;
	}

@WebMethod
public List<Bachelier>  listebachelier() throws ClassNotFoundException {
	 List<Bachelier> list=new ArrayList<Bachelier>();

	Connection conn = Singleton.getInstance().getConnection();
	PreparedStatement stmt;
	try {
		stmt = conn.prepareStatement("SELECT * FROM resultat GROUP BY cin");

	Bachelier bachelier;
	             ResultSet rs = stmt.executeQuery();

	             while(rs.next()) {
	            	 int id = rs.getInt("id");
	 				double notemath = 0;
	 				double notephys = 0;
	 				double notearabe = 0;
	 				double noteanglais = 0;
	 				String nomprenom = rs.getString("nomprenom");
	 				String cin = rs.getString("cin");
	 				String numetud = rs.getString("cne");
	 				System.out.println("dkhal service liste "+id+cin+numetud);
	 				Bachelier l=new Bachelier(id,cin,numetud,notemath,notephys,notearabe,noteanglais,nomprenom);
	             	list.add(l);
	             	
	             }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	        
	         return list;
	      }

}
