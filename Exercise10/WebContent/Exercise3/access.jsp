<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.*"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Access jsp</title>
</head>
<body>
Accessed to access.jsp<br>
<%!
private int accessCount = 0;
private Date previousDate;
private String previousHost = "<i>no previous host</i>";
%>

Access count : <%= accessCount++ %><br>
Previous Date : <%= previousDate %><br>
Previous Host : <%= previousHost %><br>

</body>
</html>