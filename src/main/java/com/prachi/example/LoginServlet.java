package com.prachi.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    //Flow 1. Login Servlet -> GET -> login.jsp
    //Flow 2. Login Servlet -> POST (Success) -> result.jsp
    //Flow 3. Login Servlet -> POST (Failure) -> login.jsp (with error message)

    UserValidator userValidator = new UserValidator();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String nameobj = request.getParameter("name");
        String passwordobj = request.getParameter("password");

        request.setAttribute("name", nameobj);
        request.setAttribute("password", passwordobj);
        System.out.println(nameobj+" , "+ passwordobj);
        if(userValidator.isUserValid(nameobj, passwordobj)) {
            request.getRequestDispatcher("/WEB-INF/view/result.jsp").forward(request, response);
        } else  {
            request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
        }
    }
}
