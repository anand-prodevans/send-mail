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
Enter your Information:
	<form action="resetUsername" method="post">
		<table>
			<tr>
				<th> Name </th>
				
				<td colspan="2"><input type="text" name="name"> </td>
			</tr>
			
			<tr>
				<th> Email </th>
				
				<td colspan="2"><input type="text" name="email"> </td>
			</tr>
			
			<tr>
				<th> Subject </th>
				
				<td colspan="2"><input type="text" name="subject"> </td>
			</tr>
			
			<tr>
				<th> Message </th>
				
				<td colspan="2"><input type="text" name="msg"> </td>
			</tr>
			
			
			<tr>
				<td><input type="Submit" value="Submit">  </td>
				
			</tr>
			
		</table>
	</form>
</body>
</html>