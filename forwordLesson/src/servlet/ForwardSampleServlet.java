package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForwardSampleServlet")
public class ForwardSampleServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fortune="大吉";
		request.setAttribute("ft", fortune);
		String weather="晴れ";
		request.setAttribute("wt", weather);
		int comfortIndex=85;
		request.setAttribute("ci", comfortIndex);
		RequestDispatcher dispacher=request.getRequestDispatcher("/WEB-INF/jsp/forwardSample.jsp");
		dispacher.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
