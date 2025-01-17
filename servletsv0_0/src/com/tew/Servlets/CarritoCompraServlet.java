package com.tew.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CarritoCompraServlet
 */
@WebServlet("/CarritoCompraServlet")
public class CarritoCompraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarritoCompraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Session
		HashMap<String, Integer> carrito = (HashMap<String, Integer>) request.getSession().getAttribute("carrito");
		if (carrito == null) {
			carrito = new HashMap<String, Integer>();
		}
		
		String product_id = request.getParameter("product_id");
		if ( product_id != null ) {
			
			Integer cantidad = (Integer) carrito.get(product_id);
			if ( cantidad == null ) {
				cantidad = new Integer(1);
			} else {
				cantidad += 1;
			} 
			//Y a�adimos el producto al carrito
			carrito.put(product_id, cantidad);
		}
		
		request.getSession().setAttribute("carrito", carrito);
		
		RequestDispatcher dispatcher = 
				getServletContext().getNamedDispatcher("CarritoCompraVistaServlet");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
