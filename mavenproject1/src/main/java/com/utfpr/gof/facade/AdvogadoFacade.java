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
public class AdvogadoFacade {
    public static final int CRIMINAL = 0;
    public static final int CIVIL = 1;
    
    public Processo getProcesso(int tipo){
        switch (tipo){
            case CRIMINAL:
                Justica justicaCriminal = new JusticaCriminal();
                return justicaCriminal.getProcesso();
            case CIVIL:
                Justica justicaCivil = new JusticaCivil();
                return justicaCivil.getProcesso();
            default:
                return null;
        }
    }
    
}
