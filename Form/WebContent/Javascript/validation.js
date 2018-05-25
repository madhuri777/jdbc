function validation() {
	var name=document.getElementById("username").value;
	 var email_id=document.getElementById("emails").value;
	 var repass=document.getElementById("repasswd").value;
	 var pass=document.getElementById("password").value;
//alert("user info is "+name);

	 if(name_validation(name)){
		 if(email_validation(email_id)){
			 if(pass_validation(pass,repass)){
				 
			 }
		 }
	 }
 
}
function name_validation(name) {
	var pattern=/^[A-Za-z]+$/;
	
	if(name!=""&&!name.value.match(pattern)){
		alert("please enter name with all charachters only");
			return false;
		}else{
			
			return true;
		}
	
	}

function email_validation(email_id){
	var x=email;
	alert("email is",x);
	var atposition=x.indexOf("@");  
	var dotposition=x.lastIndexOf(".");  
	if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){  
		  alert("Please enter a valid e-mail address ");  
		  return false;  
		  }  
}
function pass_validation(pass,repass){
	alert("pass is ",pass ,repass);
	if(pass!=repass){
		alert("please enter the same password");
		return false;
	}else{
		return true;
	}
} 