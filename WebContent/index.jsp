<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User Login</h1>

	<form name = "f1" method ="post" action ="UserControl">
		<h2>Enter username :</h2>
		<input type = "text" name ="username"><br>
		<h2>Enter password :</h2>
		<input type ="password" name ="userpassword"><br/>
		<input type="checkbox" name="chechvalue" value="chechvalue">Remember Credentials<br>
		<input type ="submit" name = "btn1" value ="submit">
	</form>
	 

</body>
</html>