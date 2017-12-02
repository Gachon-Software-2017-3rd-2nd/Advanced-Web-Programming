package myPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exercise5
 */
@WebServlet("/Exercise5")
public class Exercise5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exercise5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		out.print("<font>US state : </font>");
		out.println("<form method=post action Exercise5>");
		out.println("<input type=text name=state_name/>");
		out.println("<input type=submit value=\"submit\"/>");
		out.println("</form>");
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
//		Enumeration<String> names = request.getParameterNames();
//		while(names.hasMoreElements()) {
//			System.out.println(names.nextElement());
//		}
		HashMap<String, String> stateMap = new HashMap<String, String>();
		PrintWriter out = response.getWriter();
		StatePair pairBean;
		
		stateMap.put("California", "CA");
		stateMap.put("Alabama", "AL");
		stateMap.put("Alaska", "AK");
		stateMap.put("Colorado", "CO");
		stateMap.put("Florida", "FL");
		stateMap.put("Hawaii", "HI");
		stateMap.put("Idaho", "ID");
		
		out.println("<html>");
		out.println("<body>");
		String stateName = request.getParameter("state_name/");
		if (stateMap.containsKey(stateName)) {
			String key = stateMap.get(stateName);
			pairBean = new StatePair(stateName, key);
			
			out.println("Input state name : "+pairBean.getStateName()+"<br>");
			out.println("State abbreviation : "+pairBean.getStateAbbreviation());
		}else if (stateName.length() != 0){
			out.println("<font color=\"red\">Error! Unknown state name!</font>");
		}else {
			out.println("<font color=\"red\">Error! Missing data!</font>");
		}
		out.println("</body>");
		out.println("</html>");
	}

}
