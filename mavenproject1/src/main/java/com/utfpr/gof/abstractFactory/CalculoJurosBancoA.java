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
public class CalculoJurosBancoA implements CalculoJuros{

    @Override
    public void exibirInfoJuros() {
        System.out.println("Juros do banco A: 8% ao ano");
    }
    
}
