/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.services;

import br.edu.ifpb.entidades.Banda;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author mathe
 */
@Stateful
public class ServicePlaylist {
    private List<Banda> bandas;

    public ServicePlaylist() {
    }
    
    private boolean create(Banda banda){
        return bandas.add(banda);
    }
    
    private boolean delete(Banda banda){
        return bandas.remove(banda);
    }
    
    private List<Banda> list(){
        return bandas;
    }
}
