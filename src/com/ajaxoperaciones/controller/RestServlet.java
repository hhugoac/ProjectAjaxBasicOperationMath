package com.ajaxoperaciones.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ajaxoperaciones.model.Restnumber;

@WebServlet("/RestServlet")
public class RestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		int Num1=Integer.parseInt(request.getParameter("txtNum1"));
		int Num2=Integer.parseInt(request.getParameter("txtNum2"));
		
		Restnumber objRest=new Restnumber();
		objRest.setNum1(Num1);
		objRest.setNum2(Num2);		
		PrintWriter output=response.getWriter();
		
		output.print("{\t \"Rest\":"+objRest.Restnumber()+"}");
		output.close();
	}

}
