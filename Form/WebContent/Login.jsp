<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="Stylesheet.css">

<title>Insert title here</title>
</head>
<body>
<form name="MyForm">
<div class="login">
<div class="login-header">
  <h1>Login</h1>
  </div>
   <div class="login-form">
    <h3>Username:</h3><input type="text" placeholder="Username"/><br>
    <h3>Password:</h3><input type="password" placeholder="Password"/>
    <br><br>
    <a href="servlet1"><input type="button" value="Login" class="login-button"/></a>
    <a href="Registration.jsp"><input type="button" value="SignUp" class="register"></a>
    <br>
    <h6 class="no-access">Can't access your account?</h6>
    <div class="error-page">
  <div class="try-again">Error: Try again?</div>
  </div>
  
</div>
  </div>
</form>

</body>
</html>