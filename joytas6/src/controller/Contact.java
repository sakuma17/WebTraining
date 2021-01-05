package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Person;

@WebServlet("/contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=null;
		String mode=request.getParameter("mode");
		if(mode==null || mode.equals("back")) {
			path="/WEB-INF/view/form.jsp";
		}else if(mode.equals("send")){
			path="/WEB-INF/view/send.jsp";
			HttpSession session=request.getSession();
			session.invalidate();
		}
		RequestDispatcher rd=request.getRequestDispatcher(path);
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String memo=request.getParameter("memo");
		Person person=new Person(name,email,memo);
		HttpSession session=request.getSession();
		session.setAttribute("person",person);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/confirm.jsp");
		rd.forward(request, response);
	}

}
