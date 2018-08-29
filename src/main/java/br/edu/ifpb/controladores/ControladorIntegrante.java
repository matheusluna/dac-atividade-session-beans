/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.controladores;

import br.edu.ifpb.entidades.Integrante;
import br.edu.ifpb.services.ServiceIntegrante;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author mathe
 */
@RequestScoped
public class ControladorIntegrante implements Serializable{
    
    @EJB
    private ServiceIntegrante serviceIntegrante;
    private Integrante novoIntegrante = new Integrante();
    
    public void add(){
        serviceIntegrante.add(novoIntegrante);
        novoIntegrante = new Integrante();
    }
    
    public void delete(){
        serviceIntegrante.remove(novoIntegrante);
    }
    
    public List<Integrante> list(){
        return serviceIntegrante.list();
    }
}
