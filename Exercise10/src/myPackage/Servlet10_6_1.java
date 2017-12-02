package myPackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet10_1
 */
@WebServlet("/Servlet10_6_1")
public class Servlet10_6_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] msgs;
	private boolean isEmpty = true;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet10_6_1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first = request.getParameter("first");
		String last = request.getParameter("last");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		Bean10_1 bean = new Bean10_1(first, last, email, phone);
		msgs = bean.getMsg();
		
		isEmpty = true;
		for (String msg: msgs) {
			if (!msg.isEmpty()) {
				isEmpty = false;
			}
			System.out.println("msg : "+msg);
		}
		
		if (isEmpty) {
			request.setAttribute("user", bean);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Exercise6/ex10.6_result.jsp");
			dispatcher.forward(request, response);
		}else {
request.setAttribute("user", bean);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Exercise6/ex10.6.jsp");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
