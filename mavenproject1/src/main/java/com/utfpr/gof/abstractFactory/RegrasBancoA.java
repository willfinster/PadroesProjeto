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
public class RegrasBancoA implements RegrasFactory{

    @Override
    public CalculoJuros criaJuros() {
        return new CalculoJurosBancoA();
    }

    @Override
    public CalculoDescontos criaDescontos() {
        return new CalculoDescontosBancoA();
    }

    @Override
    public CalculoMultas criaMultas() {
        return new CalculoMultasBancoA();
    }
    
}
