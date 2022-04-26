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
public class RegrasBancoB implements RegrasFactory {

    @Override
    public CalculoJuros criaJuros() {
        return new CalculoJurosBancoB();
    }

    @Override
    public CalculoDescontos criaDescontos() {
        return new CalculoDescontosBancoB();
    }

    @Override
    public CalculoMultas criaMultas() {
        return new CalculoMultasBancoB();
    }
    
}
