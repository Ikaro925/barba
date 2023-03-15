<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 28/02/2023
  Time: 3:15 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro</title>

    <link href="Css/Registro.css" rel="stylesheet" type="text/css">
</head>
<body>
    <!-- Contenido pagina -->
<h1>Formulario de registro</h1>
<form action=""method="post">
    <div id="cuadro">

            <!-- Formulario de registro -->
            <p id="titulo">Registrarse</p>
            <hr>

            <br/> <br/>
            <label id="lbl_Names"> Nombres </label>
            <br/> <br/>
            <input type="text" class="entrada">
            <br/> <br/>
            <label id="lbl_surnames"> Apellidos </label>
            <br/> <br/>
            <input type="text" class="entrada">
            <br/> <br/>
            <label id="lbl_Email"> Correo electrónico </label>
            <br/> <br/>
            <input type="text" class="entrada"/>
            <br/> <br/>
            <label id="lbl_password"> Contraseña </label>
            <br/> <br/>
            <input type="password" class="entrada"/>
            <br/> <br/>
            <label id="lbl_Rept_Password"> Repetir Contraseña </label>
            <br/><br/>
            <input type="password" class="entrada"/>
            <br/><br/>
            <input type="submit" value="Registrarse" id="button"/>
            <br/><br/>





        <br/><br/>
            <label id="subtitulo5">¿Tienes cuenta? <a href="index.jsp"> Iniciar sesión</a></label>
    </div>
</form>



</body>
</html>
<!-- Contenido pagina prueba
<div class="registro"> </div>
<label>Nombre:</label>s
<input type="text" name="nombre" /> <br>
<label>Apellido:</label>
<input type="text" name="apellido" /> <br>
<label>Correo:</label>
<input type="text" name="Correo" /> <br>
<label>Contraseña:</label>
<input type="text" name="pass"> <br>
<input type="submit" value="Registrarme">
-->