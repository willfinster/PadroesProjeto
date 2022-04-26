/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.gof.facade;

/**
 *
 * @author Aluno
 */
public class JusticaCriminal implements Justica {

    @Override
    public Processo getProcesso() {
        ProcessoCriminal processo = new ProcessoCriminal();
        return processo;
    }
    
}
