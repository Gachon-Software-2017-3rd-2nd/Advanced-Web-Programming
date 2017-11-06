package myPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mainServlet
 */
@WebServlet("/Exercise4")
public class Exercise4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final String firstNameHTML = "First name : <input type=\"text\" id=\"input_firstName\" name=\"firstName\"></input>\n";
	final String lastNameHTML = "Last name : <input type=\"text\" id=\"input_lastName\" name=\"lastName\"></input>\n";
	final String emailHTML = "E-mail : <input type=\"text\" id=\"input_email\" name=\"email\"></input>\n";
	final String phoneNumberHTML = "Phone number : <input type=\"text\" id=\"input_phoneNumber\" name=\"phone\"></input>\n";
	final String registerBtnHTML = "<input type=\"submit\" id=\"btn_register\" value=\"Register\"/> ";
	String tempFirstNameHTML, tempLastNameHTML, tempEmailHTML, tempPhoneHTML, tempRegisterHTML;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Exercise4() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");

		boolean newbie = true;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("firstName")) {
					if (!(c.getValue().equals(""))) {
						firstName = c.getValue();
					}
				}
				if (c.getName().equals("lastName")) {
					if (!(c.getValue().equals(""))) {
						lastName = c.getValue();
					}
				}
				if (c.getName().equals("email")) {
					if (!(c.getValue().equals(""))) {
						email = c.getValue();
					}
				}
				if (c.getName().equals("phone")) {
					if (!(c.getValue().equals(""))) {
						phone = c.getValue();
					}
				}
			}
		}
		
		tempFirstNameHTML = firstNameHTML;
		tempLastNameHTML = lastNameHTML;
		tempEmailHTML = emailHTML;
		tempPhoneHTML = phoneNumberHTML;

		if (firstName == "") {
			tempFirstNameHTML = firstNameHTML + "  Wrong first name!";
		} else if (firstName != null) {
			tempFirstNameHTML = "First name : <input type=\"text\" id=\"input_firstName\" name=\"firstName\" value="
					+ firstName + "></input>\n";
			Cookie tempCookie = new Cookie("firstName", firstName);
			tempCookie.setMaxAge(60*60*24);
			response.addCookie(tempCookie);
		}
		if (lastName == "") {
			tempLastNameHTML = lastNameHTML + "  Wrong last name!";
		} else if (lastName != null) {
			tempLastNameHTML = "Last name : <input type=\"text\" id=\"input_lastName\" name=\"lastName\" value="
					+ lastName + "></input>\n";
			Cookie tempCookie = new Cookie("lastName", lastName);
			
			tempCookie.setMaxAge(60*60*24);
			response.addCookie(tempCookie);
		}
		if (email == "") {
			tempEmailHTML = emailHTML + "  Wrong e-mail!";
		} else if (email != null) {
			tempEmailHTML = "E-mail : <input type=\"text\" id=\"input_email\" name=\"email\" value=" + email
					+ "></input>\n";
			Cookie tempCookie = new Cookie("email", email);
			
			tempCookie.setMaxAge(60*60*24);
			response.addCookie(tempCookie);
		}
		if (phone == "") {
			tempPhoneHTML = phoneNumberHTML + "  Wrong phone number name!";
		} else if (phone != null) {
			tempPhoneHTML = "Phone number : <input type=\"text\" id=\"input_phoneNumber\" name=\"phone\" value=" + phone
					+ "></input>\n";
			Cookie tempCookie = new Cookie("phone", phone);
			
			tempCookie.setMaxAge(60*60*24);
			response.addCookie(tempCookie);
		}

		tempFirstNameHTML += "<br>";
		tempLastNameHTML += "<br>";
		tempEmailHTML += "<br>";
		tempPhoneHTML += "<br>";

		out.print("<h3>Registration</h3>\n" + "<form ACTION=\"http://localhost:8080/Exercise9/Exercise4\">"
				+ tempFirstNameHTML + tempLastNameHTML + tempEmailHTML + tempPhoneHTML + registerBtnHTML + "</form>");
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
