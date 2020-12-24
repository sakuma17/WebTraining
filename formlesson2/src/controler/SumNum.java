package controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sumNum
 */
@WebServlet("/SumNum")
public class SumNum extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumNum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request,response);
		//get通信はパラメータがアドレスに露出する
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String numA=request.getParameter("numA");
		String numB=request.getParameter("numB");
		int sumNum=Integer.parseInt(numA)+Integer.parseInt(numB);

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<title>合計結果</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<p>"+numA+"+"+numB+"="+sumNum+"</p>");
		out.print("<input type=\"button\" onclick=\"location.href='sum.jsp'\" value=\"戻る\">");
		out.print("</body>");
		out.print("</html>");
	}

}
