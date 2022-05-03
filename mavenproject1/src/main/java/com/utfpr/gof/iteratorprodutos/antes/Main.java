/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.gof.iteratorprodutos.antes;

import java.util.ArrayList;

/**
 *
 * @author rubia
 */
public class Main {
    public static void main(String[] args) {
        ProdutosSupermercado produtosList = new ProdutosSupermercado();
        ArrayList<Produto> produtos = produtosList.getProdutos();
        
        ProdutosCafeteria lanchesList = new ProdutosCafeteria();
        Produto[] lanches = lanchesList.getProdutos();
        
        System.out.println("-----PRODUTOS SUPERMERCADO------");
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = (Produto)produtos.get(i);
            System.out.println(produto.getDescricao() + ", "+
                    produto.getPreco());
        }
        
        System.out.println("-----PRODUTOS CAFETERIA------");
        for (int i = 0; i < lanches.length; i++) {
            Produto lanche = lanches[i];
            if (lanche != null) {
                System.out.println(lanche.getDescricao() + ", "+
                    lanche.getPreco());
            }
        }
    }
}
