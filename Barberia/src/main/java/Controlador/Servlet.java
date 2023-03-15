package Controlador;

import Model.Consulta;
import Model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        System.out.println("init()config");
        super.init();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    /*----------------------------------------------------------------------------------------------------------------------------- */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Usu_Correo = request.getParameter("Correo electrónico");
        String Usu_Password = request.getParameter("Password");

        Consulta consulta = new Consulta();
        User user = new User();
        if (consulta.autenticacion(user))
        {
            //Redireccionar a otra pagina
            response.sendRedirect("menu_Admin.jsp");

        }else{

            response.sendRedirect("menu_Admin.jsp");

        }


    }


}







        /* String usu_Nombre = request.getParameter("usu_Nombre");
        String usu_Apellido = request.getParameter("usu_Apellido");
        String usu_Correo = request.getParameter("usu_Correo");
        String usu_Password = request.getParameter("usu_Password");
       // String repet_Password = request.getParameter("repet_Password");


        User user = new User();
        user.setUsu_Nombre(usu_Nombre);
        user.setUsu_Apellido(usu_Apellido);
        user.setUsu_Correo(usu_Correo);
        user.setUsu_Password(usu_Password);

        Consulta consulta = new Consulta();
        if(consulta.autenticacion(User user)) {
            consulta.autenticacion(user);

            response.se*/



