/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.daos;

import br.edu.ifpb.entidades.Banda;
import br.edu.ifpb.entidades.Integrante;
import br.edu.ifpb.interfaces.DaoBandaInterface;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author mathe
 */
public class DaoBanda  implements DaoBandaInterface{
    private EntityManager manager;
    private EntityTransaction transaction;

    public DaoBanda() {
        this.manager = Persistence
                .createEntityManagerFactory("dac-atividade-persistence")
                .createEntityManager();
        this.transaction = manager.getTransaction();
    }

    @Override
    public boolean create(Banda banda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Banda read(String nomeFantasia) {
        List<Object> consulta;
        transaction.begin();
        consulta = manager.createQuery("SELECT b FROM Banda b WHERE b.nomeFantasia = :nome").setParameter("nome", nomeFantasia).getResultList();
        transaction.commit();
        if(consulta.size() != 0){
            return (Banda) consulta.get(0);
        }
        return null;
    }

    @Override
    public boolean delete(Banda banda) {
        transaction.begin();
        manager.remove(banda);
        transaction.commit();
        return true;
    }
    
    
}
