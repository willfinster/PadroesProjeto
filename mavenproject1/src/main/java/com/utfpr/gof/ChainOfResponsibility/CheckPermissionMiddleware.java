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
public class CheckPermissionMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (email.equals("master@hcode.com.br")){
            System.out.println("Bem vindo administrador");
            return true;
        }
        System.out.println("Bem vindo");
        
        return checkNext(email,password);
    }
    
}
