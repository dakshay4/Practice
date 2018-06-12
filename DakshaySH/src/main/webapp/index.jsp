<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Skilrock Technologies</title>
<link type="text/css" rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/themes/ui-lightness/jquery-ui.css">
<style>
body{
	background: LightBlue;
}
#login1{
	float:right;
}

</style>

</head>
<body>
<img src="images/logo_login.png">
<div id="login1">

<s:form action="login" id="form">
	<s:textfield name="id" label="User_Id" class="user"></s:textfield>
	<s:textfield name="pwd" label="Password" type="password"></s:textfield>
	<s:submit value="Login"></s:submit> 
</s:form>
<a href ="<s:url action="register_menu"/>"> New User! Sign Up here</a>
</div>

</body>
</html>