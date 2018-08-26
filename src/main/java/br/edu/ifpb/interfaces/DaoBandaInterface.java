/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.interfaces;

import br.edu.ifpb.entidades.Banda;

/**
 *
 * @author mathe
 */
public interface DaoBandaInterface {
    public boolean create(Banda banda);
    public Banda read(String nomeFantasia);
    public boolean delete(Banda banda);
}
