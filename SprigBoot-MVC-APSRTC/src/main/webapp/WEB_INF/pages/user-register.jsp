<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align: center; background-color: red">APSRTC-USER-Registation</h1>
<h2 style="text-align: center;">
<frm:form modelAttribute="travel">
User-Name:<input type="text" name=UserName><br>
User-phno:<input type="tel" name=phno><br>
User-mailid:<input type="text" name= mailid><br>
User-From:<input type="text" name=userFrom><br>
User-To:<input type="text" name=UserTo><br>
User-Travel-Dt:<input type="date" name="travelDate"><br>
SUBMIT=><input type="submit"><br>I have Already Register?&nbsp;<a href="login">Login</a>
</frm:form>
</h2>

</body>
</html>