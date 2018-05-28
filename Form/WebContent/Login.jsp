<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="Stylesheet.css">
<script src="Javascript/LoginValidation.js"></script>
<title>Insert title here</title>
</head>
<body>

<div class="login">
<div class="login-header">
  <h1>Login</h1>
  </div>
   <div class="login-form">
   <form action="loginServlet" name="MyForm" onSubmit="return LoginValidation()">
    <h3>Username:</h3><input type="text" id="username" name="username" placeholder="Username"/><br>
   <!--  <h3>Email:</h3><input type="email" id="emails" name="emails" placeholder="email_id"/><br> -->
    <h3>Password:</h3><input type="password" id="passwd" name="passwd" placeholder="Password"/>
    <br><br>
    <input type="submit" value="Login" class="login-button"/>
    <a href="Registration.jsp"><input type="button" value="SignUp" class="register"></a>
    </form>
    
    <br>
    <h6 class="no-access">Can't access your account?</h6>
    <div class="error-page">
  <div class="try-again">Error: Try again?</div>
  </div>
  
</div>
  </div>
<%
Cookie[] cookies = request.getCookies();

if (cookies != null) {
 for (Cookie cookie : cookies) {
   if (cookie.getName().equals("UserName")) {
     //do something
     //value can be retrieved using #cookie.getValue()
     String name=cookie.getValue();
     out.print("cookie value is "+name);
     response.sendRedirect("WelcomeUser");
    //response.sendRedirect("loginServlet");
    }
  }
}
%>

</body>
</html>