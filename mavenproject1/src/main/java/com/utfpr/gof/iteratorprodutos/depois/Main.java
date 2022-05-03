/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.gof.iteratorprodutos.depois;

import java.util.ArrayList;

/**
 *
 * @author rubia
 */
public class Main {
    public static void main(String[] args) {
        //Padrão de Projeto GoF Iterator
        Relatorio relatorio = new Relatorio();
        relatorio.imprimeProdutos(new ProdutosSupermercado().createIterator(), 
                "PRODUTOS SUPERMERCADO");
        relatorio.imprimeProdutos(new ProdutosCafeteria().createIterator(), 
                "PRODUTOS CAFETERIA");
    }
}
