<jsp:useBean id="ob" class="com.pheonix.web.models.LoginBean"
	scope="request"></jsp:useBean>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>

	<%@include file="header.html"%>

	<h3>
		Hey
		<jsp:getProperty property="userName" name="ob" />,this is welcome
		page
	</h3>


	<%
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		String encodeURL = response.encodeURL("products.jsp");

		session.setAttribute("userName", userName);
		session.setAttribute("passWord", passWord);
		session.setMaxInactiveInterval(2);
	%>




	<p>
		Session Timeout:<%=session.getMaxInactiveInterval()%>
	</p>
	<p>
		To enjoy shopping:<a href=<%=encodeURL%>>Click here</a>
	</p>

	<%@include file="footer.html"%>
</body>
</html>