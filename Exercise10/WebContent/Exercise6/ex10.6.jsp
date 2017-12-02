<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<FORM action="http://127.0.0.1:8080/Exercise10/Servlet10_6_1">
		<LABEL>First name: </LABEL><INPUT TYPE="TEXT" NAME="first"
			value="${user.first}">${user.msg[0]}<BR> 
		<LABEL>Last name: </LABEL><INPUT TYPE="TEXT" NAME="last" value="${user.last}">${user.msg[1]}<BR>
		<LABEL>E mail: </LABEL><INPUT TYPE="TEXT" NAME="email"
			value="${user.email}">${user.msg[2]}<BR> 
		<LABEL>Phone number: </LABEL><INPUT TYPE="TEXT" NAME="phone" value="${user.phone}">${user.msg[3]}
		<P>
			<INPUT TYPE="SUBMIT" VALUE="Register">
	</FORM>

</body>
</html>