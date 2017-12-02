<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exercise 10.4</title>
</head>
<body>
<% Enumeration<String> headerNames = request.getHeaderNames(); %>

<jsp:useBean id="headerBean" class="myPackage.WannaBean" scope="session"/>
<jsp:useBean id="headerBeanApp" class="myPackage.WannaBean" scope="application"/>

<%
if (headerBeanApp.getCnt() == 0){
	headerBean.setHost(request.getHeader("host"));
	headerBean.setUserAgent(request.getHeader("user-agent"));
	
	headerBeanApp.setFirstHost(request.getHeader("host"));
	headerBeanApp.setFirstUserAgent(request.getHeader("user-agent"));
	headerBeanApp.setCnt(headerBeanApp.getCnt()+1);
}else if (headerBeanApp.getCnt() == 1){
	headerBean.setHost(request.getHeader("host"));
	headerBean.setUserAgent(request.getHeader("user-agent"));
	headerBeanApp.setCnt(headerBeanApp.getCnt()+1);
}

%>
Current Host >> <br>
<jsp:getProperty name="headerBean" property="host" /><br>
<jsp:getProperty name="headerBean" property="userAgent" /><br>

<% if (headerBeanApp.getCnt() == 2){%>
	<table border="2px">
	<tr>
	<th>Browser</th>
	<th>Host</th>
	<th>Agent</th>
	</tr>
	
	<tr>
	<td>First</td>
	<td><%= headerBeanApp.getFirstHost() %></td>
	<td><%= headerBeanApp.getFirstUserAgent() %></td>
	</tr>
	
	<tr>
	<td>Second</td>
	<td><%= headerBean.getHost() %></td>
	<td><%= headerBean.getUserAgent() %></td>
	</tr>
	
	</table>
<%}%>




</body>
</html>