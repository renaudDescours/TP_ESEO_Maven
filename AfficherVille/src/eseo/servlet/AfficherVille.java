package eseo.servlet;

import java.io.IOException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AfficherVille
 */
@WebServlet(description = "Servlet permettant de recuperer la liste des villes sur la bdd", urlPatterns = { "/AfficherVille" })
public class AfficherVille extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AfficherVille() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			Connection config = JDBCConfigurationSol2.getConnection();
			Statement statement = config.createStatement();
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM ville_france where Code_postal = 45100");
			while(resultSet.next()){
				System.out.println(" ");
		        System.out.println("nom commune : " + resultSet.getString("Nom_commune") );
				
			}
			resultSet.close();
			statement.close();
		}catch(SQLException e) {
		    e.printStackTrace();
		}
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
