package com.tew.Servlets;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tew.Beans.Calculator;

/**
 * Servlet implementation class Calculadora
 */
@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String _num1 = request.getParameter("num1");
		String _num2 = request.getParameter("num2");
		String operator = request.getParameter("operator");
		
		Integer num1;
		Integer num2;
		Integer resultado = 0;
		
		if (_num1 == null) {
			num1 = 1;
		} else {
			num1 = Integer.valueOf(_num1);
		}
		if (_num2 == null) {
			num2 = 2;
		} else {
			num2 = Integer.valueOf(_num2);
		}
		
		Calculator cal = new Calculator(num1, num2);
		if (operator != null) {
			switch(operator) {
				case "SUMA":
					cal.suma();
					//resultado = num1 + num2;
					break;
				case "PRODUCTO":
					cal.producto();
					//resultado = num1 * num2;
					break;
				case "RESTA":
					cal.resta();
					//resultado = num1 - num2;
					break;
				case "DIVISION":
					cal.division();
					//resultado = num1 / num2;
					break;
			}
		}
		
		request.getServletContext().setAttribute("cal", cal);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/calculadora.jsp");
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
