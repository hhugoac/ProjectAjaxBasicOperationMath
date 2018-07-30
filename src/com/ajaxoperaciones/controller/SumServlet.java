package com.ajaxoperaciones.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajaxoperaciones.model.Sumnumber;
/**
 * Servlet implementation class SumServlet
 */
@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Num1=Integer.parseInt(request.getParameter("txtNum1"));
		int Num2=Integer.parseInt(request.getParameter("txtNum2"));
		
		
		Sumnumber objSum1=new Sumnumber();
		objSum1.setNum1(Num1);
		objSum1.setNum2(Num2);
		
		PrintWriter output=response.getWriter();
		output.print("The result is: "+objSum1.Sumnumber());
		
	}

}
