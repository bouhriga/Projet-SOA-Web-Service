<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

<script>
        
swal({
	  title: "Thank you very much!",
	  text: "you have a grade below 12 in the subjects. you refused to take the exam!",
	  icon: "error",
	  button: "Ok",
	  
	}).then(function(e){
		location.href='index.jsp';
	});
	     
   
    </script>
</body>
</html>