<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"  %>
<%@ include file="access.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exercise10.3</title>
</head>
<body>
<%
 java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
 String today = formatter.format(new java.util.Date());
 previousDate = today;
 
 String ip = request.getRemoteAddr();
 previousHost = ip;
%>

Access count : <%= accessCount++ %><br>
Previous Date : <%= previousDate %><br>
Previous Host : <%= previousHost %><br>

</body>
</html>