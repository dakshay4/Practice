<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
body{
	background: lightblue;
}
#register{
	float: right;
}
</style>

<script>
 $(document).ready(function{(
		$(".user").change(function(event){
			var user= $(this).val();
			if(user.length()>=3){
				$(".status").html("<img src='images/loading.gif'><font color='blue'>checking availability</font>");
				$.ajax({
					type:"POST",
					url: "check_user.action?user=" + user,
					
					success: function(msg){
						$(".status").ajaxComplete(function(event,request,settings){
							$(".status").html(msg);
						});
					}
					
			});
		}
			else
				$(".status").html("<font color='blue'>Username should be minimum3 Character Long</font>");
				});
	}); 
	/* $(document).ready(function{(
			$(".user").change(function(event){
				var user= $(this).val();
				if(user.length()>=3){
					$(".status").html("img src='loading.gif'<font color='blue'>checking availability</font>");
					$.ajax(
						type:"POST"
						url: "check"
						
					});
				}
			})
		)}); 
		$(document).ready(function{(
				var x = calculate(2,3);
			document.getElementById("in").innerHTML = x;
			function calculate(a,b){
				return a*b;
			}
		});*/
	$(document).ready(function(){
		$("#flip").click(function(){
			$("#text").slideDown("slow");
		});
	});
</script>

</head>
<body>
<img src="images/logo_login.png">
<div id="register">
	<s:form action="register">
		<s:textfield name="id" label="User Id" class="user"></s:textfield>&nbsp;<span class="status"></span><br/>
		<s:textfield name="name" label="User Name"></s:textfield>
		<s:textfield name="pwd" label="Password"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:textfield name="mobile" label="Mobile Number"></s:textfield>
		<s:submit value="Register"></s:submit>
	</s:form>

</div>
<%-- 
<script>
		var x = calculate(2,3);
		document.getElementById("in").innerHTML = x;
		function calculate(a,b){
			return a*b;
		}
</script> --%>
</body>
</html>