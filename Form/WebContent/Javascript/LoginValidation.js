function LoginValidation() {
	var username=document.getElementById("username").value;
	var pass=document.getElementById("passwd").value;
	
	if(username==""||pass==""){
		alert("please enter userName and password");
		return false;
	}else{
		alert("u logein Suucefully");
		return true;
	}
}