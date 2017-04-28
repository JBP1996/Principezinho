package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Encarregado;
import services.SEncarregado;

/**
 * Servlet implementation class SEncarregado
 */
@WebServlet("/SEncarregado")
public class HEncarregado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       SEncarregado serviceEE;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HEncarregado() {
        super();
        // TODO Auto-generated constructor stub
        serviceEE = new SEncarregado();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Encarregado e= new Encarregado(serviceEE.getArEncarregados().size(),
				request.getParameter("nome"),
				request.getParameter("dNascimento"),
				Integer.valueOf(request.getParameter("cCidadao")),
				request.getParameter("contacto"),
				request.getParameter("contactoAlt"));
		
		doGet(request, response);
	}

}
