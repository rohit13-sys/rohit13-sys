<jsp:useBean id="ob" class="com.pheonix.web.models.LoginBean"
	scope="request"></jsp:useBean>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: aqua;">
	<%@include file="header.html"%>

	<%
		String userName = request.getParameter("un");
		session.setAttribute("userName", userName);
		session.setMaxInactiveInterval(5);
		String encodeURL = response.encodeURL("products.jsp");
	%>

	<h2 style="text-align: center">
		Welcome <b style="color: red"><jsp:getProperty property="userName"
				name="ob" /></b>
	</h2>


	<p style="text-align: center">
		Session_TimeOut:<%=session.getMaxInactiveInterval()%>s
	</p>
	<p style="text-align: center">
		To enjoy shopping <a href=<%=encodeURL%>>Click here</a>
	</p>

	<%@include file="footer.html"%>
</body>
</html>