package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VilleFranceDAOImpl {
	
	public void findVille() {

		try {
			Connection con = JDBCConfigurationSol2.getConnection();
			//Connection con = JDBCConfigurationSol1.getConnection();
			Statement statement = con.createStatement();
			 
			ResultSet resultSet = statement.executeQuery("SELECT * FROM ville_france where Code_postal = 45100");
			while(resultSet.next()){
		        System.out.println("nom commune : " + resultSet.getString("Nom_commune") );
				
			}
			resultSet.close();
			statement.close();
			    
		} catch (SQLException e) {
		    e.printStackTrace();
		}
            
    }
	
}
