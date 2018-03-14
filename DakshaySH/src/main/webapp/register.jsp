<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
	<s:form action="register">
		<s:textfield name="id" label="User Id"></s:textfield>
		<s:textfield name="name" label="User Name"></s:textfield>
		<s:textfield name="pwd" label="Password"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:textfield name="mobile" label="Mobile Number"></s:textfield>
		<s:submit value="Register"></s:submit>
	</s:form>
</body>
</html>