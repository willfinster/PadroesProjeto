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
public class JusticaCivil implements Justica{

    @Override
    public Processo getProcesso() {
        ProcessoCivil processo = new ProcessoCivil();
        return processo;
    }
    
}
