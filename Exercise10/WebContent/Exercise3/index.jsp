<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.*"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exercise10.3</title>
</head>
<body>

Include with file >> <br><%@ include file="access.jsp" %>
<%
 previousDate = new Date();
 previousHost = request.getRemoteHost();
%>
<br>
Include with jsp:include >> <br>
<jsp:include page="access.jsp"></jsp:include>

</body>
</html>