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
public abstract class Middleware {
    private Middleware next;
    
    public Middleware linkWith(Middleware next){
        this.next = next;
        return next;
    }
    
    public abstract boolean check(String email, String password);
    
    protected boolean checkNext(String email, String password){
        if (next == null){
            return true;
        }
        return next.check(email, password);
    }
}
