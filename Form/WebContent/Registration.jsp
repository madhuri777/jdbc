<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="Registrtion.css">
<script src="Javascript/validation.js"></script>
<title>Insert title here</title>
</head>
<body>

<div class="registration">
<div class="registration-header">
<h2>Register</h2>
</div>
<form action="servlet1" name="RegistrationForm" onSubmit="return validation()" >
<div class="registration-form">
<h3>UserName:</h3><input type="text" id="username" name="username" placeholder="username" required="required"/><br>
<h3>Email:</h3><input type="email" id="emails" name="emails" placeholder="email_id" required="required"/><br>
<h3>Password:</h3><input type="password" id="password" name="password" placeholder="password" required="required" /><br>
<h3>Re-Enter-password:</h3><input type="password" id="repasswd" name="" placeholder="re-password" required="required"/><br>
<h3>Date Of Birth:</h3><input type="date" id="date" name="bdyDate" placeholder="" required="required"/><br>
<input type="submit" value="Register" class="register">
</div>
</form>
</div>

</body>
</html>