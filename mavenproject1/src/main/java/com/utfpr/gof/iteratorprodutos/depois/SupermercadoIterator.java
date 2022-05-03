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
public class SupermercadoIterator  implements Iterator {
    private ArrayList<Produto> produtos;
    private int index;
    
    public SupermercadoIterator(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    @Override
    public boolean hasNext() {
        return index < produtos.size() && produtos.get(index) != null;
    }
    
    @Override
    public Object next() {
        return produtos.get(index++);
    }
}
