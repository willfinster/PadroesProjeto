/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.gof.ChainOfResponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static final BufferedReader reader = 
                new BufferedReader(new InputStreamReader(System.in));
        
        private static Server server;
        
        public static void init(){
            server = new Server();
            server.registerUser("master@hcode.com.br", "654123");
            server.registerUser("user@hcode.com.br", "654123");
            
            Middleware middleware = new CheckUserMiddleware(server);
            middleware.linkWith(new CheckPermissionMiddleware());
            server.setMiddleware(middleware);
            
        }
    
    
    public static void main(String[] args) throws IOException {
         
        init();
        
        boolean done;
        do{
            System.out.println("Digite o email");
            String email = reader.readLine();
            System.out.println("Digite a senha");
            String password = reader.readLine();
            done = server.logIn(email, password);
        }while (!done);
        
    }
    
}
