<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.minimvc.project.User "   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>   

</head>
<body>
<h1>Data is here</h1>
<table border="2" class=""thead-dark"">
<tr><td>Name</td>
<td>Password</td>
<td>Confirm-Password </td>
<td>Age</td>
<td>Email</td>
</tr>
<%
	HttpSession s =request.getSession();
List<User> a= (List<User>) s.getAttribute("datalist");
for(User U : a)
{
%>

<tr>
 <td><%=U.getname() %></td>
  <td><%=U.getPass() %></td>
  <td> <%=U.getCpass() %></td>
  <td> <%=U.getAge() %></td>
    <td><%=U.getEmail()%></td>
    </tr>
	
<%
}

%>
</table>

</body>
</html>