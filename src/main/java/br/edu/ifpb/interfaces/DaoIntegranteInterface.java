/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.interfaces;

import br.edu.ifpb.entidades.Integrante;
import java.util.List;

/**
 *
 * @author mathe
 */
public interface DaoIntegranteInterface {
    public boolean create(Integrante integrante);
    public Integrante read(String nome);
    public boolean delete(Integrante integrante);
    public List<Integrante> list();
}
