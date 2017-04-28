package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Crianca;

/**
 * Servlet implementation class CRelacao
 */
@WebServlet("/HandlerCrianca")
public class HandlerCrianca extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	private ArrayList<Crianca> arCriancas;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandlerCrianca() {
        super();
        // TODO Auto-generated constructor stub
        arCriancas = new ArrayList<Crianca>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setAttribute("ListaCriancas", arCriancas);
		request.getRequestDispatcher("/Crianca.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Crianca c= new Crianca(1,request.getParameter("nome"),
				request.getParameter("dNascimento"),
				Integer.valueOf(request.getParameter("cCidadao")),
				request.getParameter("observacoes"));
		arCriancas.add(c);
		
	
		for(int i=0;i<arCriancas.size();i++){
			System.out.println("Nome:"+arCriancas.get(i).getNome()+"\nData Nascimento:"+arCriancas.get(i).getData()+"\nCC:"+arCriancas.get(i).getCartaoCidadao()+"\nObs:"+arCriancas.get(i).getObservacao());
		}
		
		doGet(request, response);
	}

}
