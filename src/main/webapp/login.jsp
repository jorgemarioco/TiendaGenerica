<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="validar" method="post">
  

  <div class="container">
    <label for="usuario"><b>Usuario</b></label>
    <input type="text" placeholder="Escriba Usuario" name="usuario" required>

    <label for="pas"><b>Password</b></label>
    <input type="password" placeholder="Escriba Contraseña" name="pas" required>

    <button type="submit">Aceptar</button>
    
  </div>

 
</form>
</body>
</html>