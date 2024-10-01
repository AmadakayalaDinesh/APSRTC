<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="goat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
<h1 style="background-color: lime;">* ---YOU HAVE EDIT YOUR PAGE?---  *</h1>
<goat:form action="edit" modelAttribute="update" >
<input type="hidden" value="${details.getTicketNo() }"  name="ticketNo">
User-Name:<input type="text" name=UserName value="${details.getUserName() }"><br>
User-phno:<input type="tel" name=phno value="${details.getPhno() }"><br>
User-mailid:<input type="text" name= mailid value="${details.getMailid()}"><br>
User-From:<input type="text" name=userFrom value="${details.getUserFrom() }"><br>
User-To:<input type="text" name=UserTo value="${details.getUserTo() }"><br>
User-Travel-Dt:<input type="date" name="travelDate" value="${details.getTravelDate() }"><br>
SUBMIT=><input type="submit">
</goat:form>
</body>
</html>