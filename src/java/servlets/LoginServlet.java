/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 727334
 */
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
         
        if (username == null || password == null) {
                    getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
                    return;
        }
        
        //validation
        if (username.isEmpty() || password.isEmpty()) {
             // set error message
             request.setAttribute("errorMessage", "Invalid username or password.");
             // forward the request back to index.jsp
             getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
             // stop other execution of code
             return;
         }
        
        UserService us = new UserService();
        if(us.login(username, password)){
          request.setAttribute("username", username);
          getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);  
        }
        request.setAttribute("errorMessage", "Invalid username or password.");
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

        
        
    }


}
