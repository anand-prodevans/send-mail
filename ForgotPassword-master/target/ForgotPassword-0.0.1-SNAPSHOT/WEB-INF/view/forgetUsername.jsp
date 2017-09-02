<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>ForgotUsername</title>
</head>
<body>
Enter your registered email address:
	<form action="resetUsername" method="post">
		<table>
			<tr>

				<td colspan="2"><input type="text" name="email"> </td>
			</tr>
			
			<tr>
				<td><input type="Submit" value="Reset Username">  </td>
				<td><input type="reset" value="Cancel">  </td>
			</tr>
			
		</table>
	</form>
</body>
</html>