package com.tew.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CarritoCompraVistaServlet
 */
@WebServlet(name = "CarritoCompraVistaServlet", urlPatterns = { "/CarritoCompraVistaServlet" })
public class CarritoCompraVistaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarritoCompraVistaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> carrito = (HashMap<String, Integer>) request.getSession().getAttribute("carrito");
		
		
		String html = "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<body>\r\n" + 
				" <h2>Tienda de peliculas (VISTA)</h2>\r\n" + 
				"  <form action=\"/servletsv0_0/CarritoCompraServlet\">\r\n" + 
				"   <select name=\"product_id\" size=1>\r\n" + 
				"    <option value=\"0\">Porrillo</option>\r\n" + 
				"    <option value=\"1\">Matrix 2</option>\r\n" + 
				"    <option value=\"2\">Junaito</option>\r\n" + 
				"    <option value=\"3\">Canelita</option>\r\n" + 
				"    <option value=\"4\">CNI</option>\r\n" + 
				"    <option value=\"5\">Mosad</option>\r\n" + 
				"    <option value=\"6\">NSA</option>\r\n" + 
				"    <option value=\"7\">KGB</option>\r\n" + 
				"    <option value=\"8\">TEA</option>\r\n" + 
				"    <option value=\"9\">DEA</option>\r\n" + 
				"   </select>\r\n" + 
				"    <input type=\"submit\" value=\"Añadir\">\r\n" + 
				"  </form>\r\n" + 
				" <hr>\r\n" + 
				" <h2>Carrito</h2>\r\n";
	
		for (String id : carrito.keySet()) {
			html += "<br> ID: " + id + " --> Amount: " + carrito.get(id) + "</br>";
		}
		html += "</body>\r\n" + 
				"</html>";
		PrintWriter out = response.getWriter();
		out.println(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
