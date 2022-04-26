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
public class CalculoDescontosBancoA implements CalculoDescontos{

    @Override
    public void exibirInfoDescontos() {
        System.out.println("Descontos do banco A: 13% a vista");
    }
    
}
