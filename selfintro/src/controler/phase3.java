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

@WebServlet("/phase3")
public class phase3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public phase3() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		int raceNum=Integer.parseInt(request.getParameter("raceNum"));
		int jobNum=Integer.parseInt(request.getParameter("jobNum"));
		int hp=Integer.parseInt(request.getParameter("hp"));
		int mp=Integer.parseInt(request.getParameter("mp"));
		int power=Integer.parseInt(request.getParameter("power"));
		int dex=Integer.parseInt(request.getParameter("dex"));
		int spd=Integer.parseInt(request.getParameter("spd"));
		Avatar avatar=new Avatar(name);
		StatusLogic.jobBonusStatus(avatar,raceNum,jobNum,hp,mp,power,dex,spd);

		request.setAttribute("avatar",avatar);

		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/thirdstatus.jsp");
		rd.forward(request, response);
	}

}

