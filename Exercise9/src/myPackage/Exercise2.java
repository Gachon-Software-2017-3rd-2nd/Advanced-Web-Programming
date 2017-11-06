package myPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exericse2
 */
@WebServlet("/Exercise2")
public class Exercise2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Exercise2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String agent = request.getHeader("User-agent");
		PrintWriter out = response.getWriter();
		String chromeBodyHTML = "<body text=\"red\" bgcolor=\"yellow\">";
		String nonChromeBodyHTML = "<body text=\"white\" bgcolor=\"navy\">";

		System.out.println(agent);

		if (agent.contains("chrome") || agent.contains("Chrome")) {
			out.println(chromeBodyHTML);
		} else {
			out.println(nonChromeBodyHTML);
		}
		out.println("Hello!");
		out.println("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
