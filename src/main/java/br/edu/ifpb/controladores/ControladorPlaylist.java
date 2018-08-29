/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.controladores;

import br.edu.ifpb.services.ServicePlaylist;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mathe
 */
@Named
@SessionScoped
public class ControladorPlaylist implements Serializable{
    @EJB
    private ServicePlaylist playlist;
}
