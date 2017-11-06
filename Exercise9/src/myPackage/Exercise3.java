package myPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exercise3
 */
@WebServlet("/Exercise3")
public class Exercise3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Exercise3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("<style>\n" + "h3 { text-align: center;" + "margin: 0 auto; }\n" + "h5 { text-align: center;"
				+ "margin: 0 auto; }\n" + "div { margin: 0 auto; }" + "</style>\n" + "</head>\n" + "\n" + "<body>\n"
				+ "        <h3>Search Front-End</h3>\n"
				+ "        <h5>Choose a search engone and enter query keywords</h5>" + "    <div id=\"wrapper\">\n"
				+ "<form method=\"post\" action=\"http://localhost:8080/Exercise9/Exercise3\">"
				+ "<select name=\"engine\">\n" + "  <option value=\"naver\">Naver</option>\n"
				+ "  <option value=\"daum\">Daum</option>\n" + "  <option value=\"google\">Google</option>\n"
				+ "  <option value=\"bing\">Bing</option>\n" + "</select>"
				+ "<input type=\"text\" id=\"txt_search\" name=\"txt_search\"></input><br/>"
				+ "<input type=\"submit\" value=\"Search\"></input>" + "</form>" + "    </div>\n" + "</body>\n" + "\n"
				+ "");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String naverURL = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=";
		String daumURL = "https://search.daum.net/search?w=tot&DA=YZR&t__nil_searchbox=btn&sug=&sugo=&q=";
		String googleURL = "https://www.google.co.kr/search?newwindow=1&dcr=0&source=hp&ei=ltj_WZv6H8Wo0AS6-JuwCA&q=hello&oq=";
		String bingURL = "https://www.bing.com/search?q=";
		String targetURL = "";
		String engine = request.getParameter("engine");
		String query = request.getParameter("txt_search");

		if (engine.compareToIgnoreCase("naver") == 0) {
			targetURL = naverURL;
		} else if (engine.compareToIgnoreCase("daum") == 0) {
			targetURL = daumURL;
		} else if (engine.compareToIgnoreCase("google") == 0) {
			targetURL = googleURL;
		} else if (engine.compareToIgnoreCase("bing") == 0) {
			targetURL = bingURL;
		} else {
			targetURL = "";
		}

		if (targetURL.compareTo("") == 0) {
			response.sendRedirect("http://127.0.0.1:8080/Exercise9/Exercise3");
		} else {
			response.sendRedirect(targetURL + query);
		}
	}

}
