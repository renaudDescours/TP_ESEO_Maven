package eseo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DistanceVille
 */
@WebServlet("/DistanceVille")
public class DistanceVille extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DistanceVille() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String lats[] = request.getParameterValues("lat");
		String lngs[] = request.getParameterValues("lng");
		
		
		double lat1 = Double.parseDouble(lats[0]);
		double lng1 = Double.parseDouble(lngs[0]);
		double lat2 = Double.parseDouble(lats[1]);
		double lng2 = Double.parseDouble(lngs[1]);
		
		System.out.println(lat1);
		System.out.println(lng1);
		
		System.out.println(lat2);
		System.out.println(lng2);

		
		VilleDisplay v = new VilleDisplay();
		double result = v.getDistance(lat1, lng1, lat2, lng2);
		System.out.println(result);
		request.setAttribute("result", result);
		
		RequestDispatcher view = request.getRequestDispatcher("distance.jsp");
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
