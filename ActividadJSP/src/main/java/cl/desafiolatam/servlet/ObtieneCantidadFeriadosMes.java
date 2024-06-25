package cl.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafiolatam.utiles.UtilesGeneral;

/**
 * Servlet implementation class ObtieneCantidadFeriadosMes
 */
@WebServlet("/ObtieneCantidadFeriadosMes")
public class ObtieneCantidadFeriadosMes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ObtieneCantidadFeriadosMes() {
        super();
        
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 		
 		
 		int numMes = Integer.parseInt(request.getParameter("mes"));

		 UtilesGeneral utilesgeneral = new UtilesGeneral();
		 String feriadosMes = utilesgeneral.feriadosMes(numMes);

		 response.getWriter().append(feriadosMes);
 		
 		
 		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doGet(request, response);
	}

}
