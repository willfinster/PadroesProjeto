/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.gof.ChainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aluno
 */
public class Server {
    private final Map<String, String> users = new HashMap<>();
    private Middleware middleware;
    
    public void setMiddleware(Middleware middleware){
        this.middleware = middleware;
    }
    
    public boolean logIn(String email, String password){
        if (middleware.check(email, password)){
            System.out.println("Usuário autenticado com sucesso!");
            System.out.println("Seja bem vindo");
            return true;
        }
        return false;
    }
    
    public void registerUser(String email, String password){
        users.put(email, password);
    }
    
    public boolean hasEmail(String email){
        return users.containsKey(email);
    }
    
    public boolean isValidPassword(String email, String password){
        return users.get(email).equals(password);
    }
    
}
