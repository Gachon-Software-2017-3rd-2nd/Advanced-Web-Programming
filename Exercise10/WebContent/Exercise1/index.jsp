<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>

<%! 
private String firstName = "";
private String lastName = "";
private String email = "";
private String phone = "";
private boolean noFirstName = true;
private boolean noLastName = true;
private boolean noEmail = true;
private boolean noPhone = true;
%>

<%
firstName = request.getParameter("firstName");
lastName = request.getParameter("lastName");
email = request.getParameter("email");
phone = request.getParameter("phone");

if (firstName != "") {
	noFirstName = false;
}else{
	noFirstName = true;
}
if (lastName != "") {
	noLastName = false;
}else{
	noLastName = true;
}
if (email != "") {
	noEmail = false;
}else{
	noEmail = true;
}
if (phone != "") {
	noPhone = false;
}else{
	noPhone = true;
}
System.out.println(firstName);
%>

<% 
if ((firstName != "" && lastName != "" && email != "" && phone != "")
		&&
		(firstName != null && lastName != null && email != null && phone != null)) {
	out.print("<h2>Read Parameters</h2>");
	out.print("<p>First Name: "+firstName+"</p>");
	out.print("<p>Last Name: "+lastName+"</p>");
}else {
	out.print("<h2>Registration</h2>");
	// FirstName
	out.println("<form action=\"http://localhost:8080/Exercise10/Exercise1/index.jsp\" method=\"GET\">");
	
	if (firstName == "" || firstName == null){
		firstName = "";
	}
	out.println("First name   : <input type=\"text\" id=\"txt_firstName\" name=\"firstName\" value=\""+firstName+"\"/>");
	if (firstName == ""){
		out.println(" <font color=\"red\">Enter first name</font><br>");
	}else{
		out.println("<br>");
	}
	
	if (lastName == "" || lastName == null){
		lastName = "";
	}
	out.println("Last name   : <input type=\"text\" id=\"txt_lastName\" name=\"lastName\" value=\""+lastName+"\"/>");
	if (lastName == ""){
		out.println(" <font color=\"red\">Enter last name</font><br>");
	}else{
		out.println("<br>");
	}
	
	if (email == "" || email == null){
		email = "";
	}
	out.println("Email   : <input type=\"text\" id=\"txt_email\" name=\"email\" value=\""+email+"\"/>");
	if (email == ""){
		out.println(" <font color=\"red\">Enter E-mail</font><br>");
	}else{
		out.println("<br>");
	}
	
	if (phone == "" || phone == null){
		phone = "";
	}
	out.println("Phone number   : <input type=\"text\" id=\"txt_phone\" name=\"phone\" value=\""+phone+"\"/>");
	if (phone == ""){
		out.println(" <font color=\"red\">Enter Phone number</font><br>");
	}else{
		out.println("<br>");
	}
	
	out.println("<input type=\"submit\" id=\"sbm_regist\" value=\"Register\"/>");
	out.println("</form>");
}
%>

<!--
Last name    : <input type="text" id="txt_lastName" name="lastName" value="<%= lastName %>"/><% if (noLastName==true) { out.print(" <font color=\"red\">Enter last name</font>"); } %><br>
E-mail       : <input type="text" id="txt_email" name="email" value="<%= email %>"/><% if (noEmail==true) { out.print(" <font color=\"red\">Enter E-mail</font>"); } %><br>
Phone number : <input type="text" id="txt_phone" name="phone" value="<%= phone %>"/><% if (noPhone==true) { out.print(" <font color=\"red\">Enter Phone number</font>"); } %><br>
<input type="submit" id="sbm_regist" value="Register"/>
</form>
-->

</body>
</html>