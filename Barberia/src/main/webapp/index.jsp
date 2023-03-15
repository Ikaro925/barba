<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Iniciar sesion</title>
    <link href="Css/Iniciar_Sesion.css" rel="stylesheet" type="text/css">
</head>
    <body>
        <h1><%= "Formulario de ingreso de sesión" %></h1>
        <form action="" method="post">
            <div id="cuadro2">
                <!--Formulario inicio de sesión -->
                 <p id="titulo">Iniciar sesión</p>
                <hr>
                <br/> <br/>
                <label id="lbl_Email_Is"> Correo electrónico </label>
                <br/> <br/>
                <input type="text" class="entrada"/>
                <br/> <br/>
                <label id="lbl_Password_Is"> Password</label>
                <br/> <br/>
                <input type="password" class="entrada"/>
                <br/> <br/>
                <input type="submit" value="Iniciar sesión" id="button"/>
                <br><br/>
                No tienes una cuenta.... <a href="registro.jsp"> Registrarme</a>
        </div>
        </form>


    </body>
</html>

<!--
<td></td><label>Correo: </label><td/>
<input type="text" name="usuario"/> <br>
<label>Contraseña: </label>
<input type="password" name="pass">


<br>
<input type="submit" value="iniciar sesion">
-->