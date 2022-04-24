/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.gof.abstractFactory;

/**
 *
 * @author will_
 */
public class CalculoMultasBancoB implements CalculoMultas{

    @Override
    public void exibirInfoMultas() {
        System.out.println("Multas do banco B: 4% ao dia.");
    }
    
}
