package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TodoDAO;
import model.Todo;

@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		if(id==null) {
			response.sendRedirect("/todoapp/Read");
		}else {
			TodoDAO dao=new TodoDAO();
			Todo todo=dao.findOne(Integer.parseInt(id));
			request.setAttribute("todo",todo);
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/update.jsp");
			rd.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String title=request.getParameter("title");
		String importance=request.getParameter("importance");
		Todo todo=new Todo(Integer.parseInt(id),title,Integer.parseInt(importance));
		TodoDAO dao=new TodoDAO();
		dao.updateOne(todo);
		response.sendRedirect("/todoapp/Read");
	}

}
