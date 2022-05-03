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
public class ProdutosSupermercado {
    private ArrayList<Produto> produtosList;
    
    public ProdutosSupermercado() {
        produtosList = new ArrayList<Produto>();
        addProduto("Alface", 5.50);
        addProduto("Agrião", 4.00);
        addProduto("Laranja", 6.00);
        addProduto("Maçã", 8.99);
        addProduto("Tomate", 12.00);
    }
    
    public void addProduto(String descricao, double preco) {
        Produto produto = new Produto(descricao, preco);
        produtosList.add(produto);
    }
    
    public ArrayList<Produto> getProdutos() {
        return produtosList;
    }
}
