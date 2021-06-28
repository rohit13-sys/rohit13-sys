<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:useBean id="ob" class="com.pheonix.web.models.LoginBean" scope="request"></jsp:useBean>
<jsp:setProperty property="userName" name="ob" />
<jsp:setProperty property="passWord" name="ob" />
<%
	if (ob.isValid()) {
%>
<jsp:forward page="/welcome.jsp">
	<jsp:param value="Rohit" name="b1" />
	<jsp:param value="Khatwani" name="b2" />
</jsp:forward>
<%
	} else {
%>
<h2 style="color: red;">Invalid login</h2>
<jsp:include page="login.html" />

<%
	}
%>