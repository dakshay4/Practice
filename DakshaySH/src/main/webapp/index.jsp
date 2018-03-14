<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Skilrock Technologies</title>
</head>
<body>
Welcome !
<s:form action="login">
	<s:textfield name="id" label="User_Id"></s:textfield>
	<s:textfield name="pwd" label="Password" type="password"></s:textfield>
	<s:submit value="Login"></s:submit> 
</s:form>

<a href =register.jsp> New User! Sign Up here</a>
</body>
</html>