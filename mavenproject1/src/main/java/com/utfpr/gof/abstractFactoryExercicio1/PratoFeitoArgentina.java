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
public class PratoFeitoArgentina implements PratoFeito {

    @Override
    public void exibirPratoFeito() {
        System.out.println("Prato Feito: Bife de chorizo, purê de batata e salada");
    }
    
}
