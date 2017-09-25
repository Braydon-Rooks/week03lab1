/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

/**
 *
 * @author 671978
 */
public class UserService {
    
    public boolean login(String username,String password)
    {
        String user1 = "adam";
        String user2 = "betty";
        String pass = "password";
        
        if((username.equals(user1)||username.equals(user2))&&password.equals(pass))
        {
            return true;
        }
        else{
           return false;  
        }
       
    }
    
    
}
