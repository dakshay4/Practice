<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
$(function () {
    $(".repeat").on('click', function (e) {
        e.preventDefault();
        var $self = $(this);
        $self.before($self.prev('table').clone());
        //$self.remove();
    });
});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SkilRock Technologies</title>
</head>
<body>
Choose Match
<s:form action="questions">
 <div class="repeatable">
        <table border="1">
            <tr>
                <td>
                    <s:textfield name="no_of_questions" label="No_of_Questions" placeholder="Enter No of Questions"></s:textfield>
                </td>
            </tr>
        </table>
        <button class="repeat">Add Another</button>
    </div>
	
</s:form>
</body>
</html>