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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegrasFactory regras = new RegrasBancoA();
        CalculoJuros juros = regras.criaJuros();
        CalculoDescontos descontos = regras.criaDescontos();
        CalculoMultas multas = regras.criaMultas();
        
        juros.exibirInfoJuros();
        descontos.exibirInfoDescontos();
        multas.exibirInfoMultas();
        
        regras = new RegrasBancoB();
        juros = regras.criaJuros();
        descontos = regras.criaDescontos();
        multas = regras.criaMultas();
        
        juros.exibirInfoJuros();
        descontos.exibirInfoDescontos();
        multas.exibirInfoMultas();
        
        
    }
    
}
