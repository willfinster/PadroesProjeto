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
public class CafeteriaIterator implements Iterator {
    private Produto[] produtos;
    private int index;
    
    public CafeteriaIterator(Produto[] produtos) {
        this.produtos = produtos;
    }
    
    @Override
    public boolean hasNext() {
        return index < produtos.length && produtos[index] != null;
    }
    
    @Override
    public Object next() {
        return produtos[index++];
    }
}
