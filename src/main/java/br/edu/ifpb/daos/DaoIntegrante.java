/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.daos;

import br.edu.ifpb.entidades.Integrante;
import br.edu.ifpb.interfaces.DaoIntegranteInterface;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author mathe
 */
public class DaoIntegrante implements DaoIntegranteInterface{
    private EntityManager manager;
    private EntityTransaction transaction;

    public DaoIntegrante() {
        this.manager = Persistence
                .createEntityManagerFactory("dac-atividade-persistence")
                .createEntityManager();
        this.transaction = manager.getTransaction();
    }

    @Override
    public boolean create(Integrante integrante) {
        Integrante i = read(integrante.getNome());
        if(i == null){
            transaction.begin();
            manager.persist(integrante);
            transaction.commit();
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Integrante read(String nome) {
        List<Object> consulta;
        transaction.begin();
        consulta = manager.createQuery("SELECT i FROM Integrante i WHERE i.nome = :nome").setParameter("nome", nome).getResultList();
        transaction.commit();
        if(consulta != null){
            return (Integrante) consulta.get(0);
        }
        return null;
    }

    @Override
    public boolean delete(Integrante integrante) {
        transaction.begin();
        manager.remove(integrante);
        transaction.commit();
        return true;
    }
    
}
