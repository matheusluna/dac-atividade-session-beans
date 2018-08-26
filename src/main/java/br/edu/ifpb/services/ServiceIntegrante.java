/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.services;

import br.edu.ifpb.daos.DaoIntegrante;
import br.edu.ifpb.entidades.Integrante;

/**
 *
 * @author mathe
 */
public class ServiceIntegrante {
    
    private DaoIntegrante daoIntegrante;

    public ServiceIntegrante() {
        this.daoIntegrante = new DaoIntegrante();
    }
    
    public boolean add(Integrante integrante){
        return daoIntegrante.create(integrante);
    }
    
    public Integrante search(String nome){
        return daoIntegrante.read(nome);
    }
    
    public boolean remove(Integrante integrante){
        return daoIntegrante.delete(integrante);
    }
}
