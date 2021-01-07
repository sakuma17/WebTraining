package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Vegetable;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/main.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		List<Vegetable> list=(List<Vegetable>)session.getAttribute("list");
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		if(name.isEmpty()||price.isEmpty()) {
			request.setAttribute("error","未記入の項目があります");
		}else {
			Vegetable vege=new Vegetable(name,price);
			if(list==null) {
				list=new ArrayList<>();
			}
			list.add(vege);
			session.setAttribute("list", list);
			request.setAttribute("message", name+"をカートに追加しました");
		}
		doGet(request,response);
	}

}
