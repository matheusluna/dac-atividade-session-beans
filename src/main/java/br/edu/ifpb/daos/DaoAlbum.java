/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.daos;

import br.edu.ifpb.entidades.Album;
import br.edu.ifpb.interfaces.DaoAlbumInterface;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author mathe
 */
public class DaoAlbum implements DaoAlbumInterface{
    private EntityManager manager;
    private EntityTransaction transaction;

    public DaoAlbum() {
        this.manager = Persistence
                .createEntityManagerFactory("dac-atividade-persistence")
                .createEntityManager();
        this.transaction = manager.getTransaction();
    }

    @Override
    public boolean create(Album album) {
        transaction.begin();
        manager.persist(album);
        transaction.commit();
        return true;
    }

    @Override
    public boolean delete(Album album) {
        transaction.begin();
        manager.remove(album);
        transaction.commit();
        return true;
    }
    
    
}
