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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegrasFactory regras = new PratosDaArgentina();
        PratoFeito pratoFeito = regras.criaPratoFeito();
        Sobremesa sobre = regras.criaSobremesa();
        
        pratoFeito.exibirPratoFeito();
        sobre.exibirSobremesa();
        
        regras = new PratosDoBrasil();
        pratoFeito = regras.criaPratoFeito();
        sobre = regras.criaSobremesa();
        
        pratoFeito.exibirPratoFeito();
        sobre.exibirSobremesa();
    }
    
}
