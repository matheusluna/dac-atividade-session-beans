/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.interfaces;

import br.edu.ifpb.entidades.Album;
import br.edu.ifpb.entidades.Banda;

/**
 *
 * @author mathe
 */
public interface DaoAlbumInterface {
    public boolean create(Album album);
    public boolean delete(Album album);
}
