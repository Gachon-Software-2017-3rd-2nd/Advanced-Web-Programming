<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exercise10.2</title>
</head>
<body text="red" bgcolor="yellow">

<%
Enumeration<String> headerNames = request.getHeaderNames();

while (headerNames.hasMoreElements()) {
	String tmpName = headerNames.nextElement();
	out.println("<h3>");
	out.print(tmpName+ " : ");
	out.println(request.getHeader(tmpName));
	out.println("</h3>");
}
%>

</body>
</html>