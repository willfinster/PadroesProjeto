/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.gof.iteratorprodutos.depois;

/**
 *
 * @author rubia
 */
public class Relatorio {
    public void imprimeProdutos(Iterator iterator, String descricao) {
        System.out.println("-----"+descricao+"------");
        while (iterator.hasNext()) {
            Produto produto = (Produto) iterator.next();
            System.out.println(produto.getDescricao()+", "+
                    produto.getPreco());
        }
    }
}
