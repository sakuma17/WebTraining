package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Names;

@WebServlet("/start")
public class start extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Names names=new Names();
		HttpSession hs=request.getSession();
		hs.setAttribute("Names",names);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/jsp1.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int position=Integer.parseInt(request.getParameter("btn"));
		HttpSession hs=request.getSession();
		Names names=(Names)hs.getAttribute("Names");
		names.setOpend(position);
		hs.setAttribute("Names",names);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/jsp1.jsp");
		rd.forward(request, response);
	}

}
