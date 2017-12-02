<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="limit" required="true" %>

<%
Double randDouble = new Double(Math.random()*1000000);
int randInt = 0;
int limitInt = Integer.parseInt(limit);
randInt = randDouble.intValue() % limitInt;
%>
<font><%= randInt %> 
</font>