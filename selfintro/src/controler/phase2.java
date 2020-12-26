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

@WebServlet("/phase2")
public class phase2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public phase2() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String race=request.getParameter("race");
		int raceNum=Integer.parseInt(race);
		Avatar self=(Avatar)request.getAttribute("self");
		int[] status=self.getStatus();
		int[] secondStatus=StatusLogic.raceBonusStatus(status, raceNum);
		self.setRace(StatusLogic.race(raceNum));
		self.setStatus(secondStatus);

		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/secondstatus.jsp");
		rd.forward(request, response);
	}

}
