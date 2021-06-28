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
<body style="background-color: fuchsia;">
	<%@include file="header.html"%>

	<%
		HttpSession ss = request.getSession(false);
		if (ss != null) {
			String user = (String) ss.getAttribute("userName");
			if (user != null) {
				%>
				<h2 style="text-align: center;">
					Welcome <b style="color: green;"><%=ss.getAttribute("userName")%></b>
				</h2>
				<h3 style="text-align: center;">You Can shop from here</h3>
				<%
					} else {
				%>
				<h2 style="text-align:center">Sorry!!Session timeOut</h2>
				<h4 style="text-align:center">Kindly,ReLogin</h4>
				<%
					}
		}
	%>

	<%@include file="footer.html"%>
</body>
</html>