package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ChangeLogic;
import model.Info;

@WebServlet("/ItoC")
public class InchToCm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/input.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double inch=Double.parseDouble(request.getParameter("inch"));
		Info info=new Info(inch);
		ChangeLogic cl=new ChangeLogic();
		cl.Change(info);
		request.setAttribute("info",info);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/result.jsp");
		rd.forward(request, response);
	}

}
