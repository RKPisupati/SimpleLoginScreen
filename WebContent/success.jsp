<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Success</title>
</head>
<body>
<form method="post" action="logout">
    <div style="text-align: center">
        <h1>Hello ${user}.. Welcome to My Website  !!</h1>
        <br><br>
        <button type="submit">Logout</button>
        
    </div>
  </form>
  </body>
</html>