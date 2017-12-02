<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration"%>
<%@ page import="java.util.Hashtable"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<%
	String result2 = "";
	String user = request.getHeader("User-agent");
%>
<body <%=result2%>>
	<jsp:useBean id="header" class="myPackage.Bean10_4" scope="application" />
	<%
		Enumeration<String> hname = request.getHeaderNames();
		Hashtable<String, String> present = new Hashtable<String, String>();
		Hashtable<String, String> prev = header.getHeader();
		while (hname.hasMoreElements()) {
			String name = (String) hname.nextElement();
			String temp = name.substring(0, 1).toUpperCase() + name.substring(1);
			String value = request.getHeader(name);
			present.put(temp, value);
		}
	%>
	<table border="1">
		<tr>
			<td>Accept</td>
			<td>${header.Accept}</td>
		</tr>
		<tr>
			<td>Accept-language</td>
			<td>${header['Accept-language']}</td>
		</tr>
		<tr>
			<td>Cache-control</td>
			<td>${header['Cache-control']}</td>
		</tr>
		<tr>
			<td>Ua-cpu</td>
			<td>${header['Ua-cpu']}</td>
		</tr>
		<tr>
			<td>Accept-encoding</td>
			<td>${header['Accept-encoding']}</td>
		</tr>
		<tr>
			<td>User-agent</td>
			<td>${header['User-agent']}</td>
		</tr>
		<tr>
			<td>Host</td>
			<td>${header['Host']}</td>
		</tr>
		<tr>
			<td>Connection</td>
			<td>${header['']}</td>
		</tr>
	</table>
	<jsp:setProperty name="header" property="header" value="<%=present%>" />
	<%
		if (prev != null) {
	%>
	<table border="1">
		<%
			for (String key : prev.keySet()) {
		%>
		<tr>
			<td><%=key%></td>
			<td><%=prev.get(key)%></td>
		</tr>
		<%
			}
			}
		%>
	</table>

</body>
</html>