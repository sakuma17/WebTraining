package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Avatar;
import model.StatusLogic;

@WebServlet("/phase1")
public class phase1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/nameinput.jsp");
		rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		Avatar self=new Avatar(name);

		new StatusLogic(self);

		request.setAttribute("self",self);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/firststatus.jsp");
		dispatcher.forward(request, response);
	}

}
