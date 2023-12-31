package com.example.shoppingcart.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/log-out")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if(request.getSession().getAttribute("auth")!=null) {
            request.getSession().removeAttribute("auth");
            response.sendRedirect("login.jsp");
        }else {
            response.sendRedirect("index.jsp");
        }

    }
}
