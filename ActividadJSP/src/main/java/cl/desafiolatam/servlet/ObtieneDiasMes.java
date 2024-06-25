package cl.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafiolatam.utiles.UtilesGeneral;

/**
 * Servlet implementation class ObtieneDiasMes
 */
@WebServlet("/ObtieneDiasMes")
public class ObtieneDiasMes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	//Constructor
	public ObtieneDiasMes() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int numMes = Integer.parseInt(request.getParameter("mes"));

		 UtilesGeneral utilesgeneral = new UtilesGeneral();
		 String diasMes = utilesgeneral.diasMes(numMes);

		 response.getWriter().append(diasMes);
		
		
		
		
		
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
