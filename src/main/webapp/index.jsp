<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student registration</title>
</head>
<body>
	<h1>Student registration form</h1>
	<html:form action="StudentReg" method="post">
		NAME :           <html:text property="name" />
		<br>
		<br>
		EMAIL :           <html:text property="email" />
		<br>
		<br>
		<html:errors property="email_e" />
		<br>
		<br>
		ADDRESS :           <html:textarea property="address" />
		<br>
		<br>
		<html:errors property="address_e" />
		<br>
		<br>
		<html:submit value="Register" />
	</html:form>
</body>
</html>