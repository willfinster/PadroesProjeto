/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.gof.ChainOfResponsibility;

/**
 *
 * @author Aluno
 */
public class CheckUserMiddleware extends Middleware{

    private Server server;
    
    public CheckUserMiddleware(Server server){
        this.server = server;
    }
    
    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)){
            System.out.println("Email inválido!");
            return false;
        }
        
        if (!server.isValidPassword(email,password)){
            System.out.println("Email ou senha inválidos!");
            return false;
        }
        
        return checkNext(email, password);
    }
    
}
