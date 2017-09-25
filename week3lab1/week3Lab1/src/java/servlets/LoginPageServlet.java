/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import domain.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 671978
 */
public class LoginPageServlet extends HttpServlet {

    
  
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserService userServ = new UserService();
         String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        User u1 = new User();
        u1.setUserName(user);
        u1.setPassword(pass);
        
       
        if(user==null||user.isEmpty()||pass==null||pass.isEmpty())
        {
            request.setAttribute("ErrorMessage", "Username and Password are required");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        
        if(!userServ.login(u1.getUserName(),u1.getPassword()))
        {
             request.setAttribute("incorrect", "Invalid Username or Password");
             request.setAttribute("user", user);
             request.setAttribute("pass", pass);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        
        
        request.setAttribute("user",u1.getUserName());
        getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
       
    }

   

}
