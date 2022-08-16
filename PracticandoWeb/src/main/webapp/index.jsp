<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora</title>
</head>
<body>

	<form action="Calculadora" method="post">
		<label>Numero</label> 
		<input type="text" name="fistNumber" placeholder="Ingrese un numero"> 
		<select name="options">
			<option value="0">sumar</option>
			<option value="1">restar</option>
			<option value="2">multiplicar</option>
			<option value="3">dividir</option>
		</select> 
		<label>Numero</label> 
		<input type="text" name="secondNumber" placeholder="Ingrese un numero">

	</form>

</body>
</html>