/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.gof.abstractFactoryExercicio1;

/**
 *
 * @author will_
 */
public class PratosDaArgentina implements RegrasFactory {

    @Override
    public PratoFeito criaPratoFeito() {
        return new PratoFeitoArgentina();
    }

    @Override
    public Sobremesa criaSobremesa() {
        return new SobremesaArgentina();
    }
    
}
