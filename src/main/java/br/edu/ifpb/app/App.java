/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.app;

import br.edu.ifpb.daos.DaoIntegrante;
import br.edu.ifpb.entidades.CPF;
import br.edu.ifpb.entidades.Integrante;
import java.time.LocalDate;
import java.time.Month;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author mathe
 */
public class App {
    public static void main(String[] args) {
        DaoIntegrante daoIntegrante = new DaoIntegrante();
        Integrante integrante = daoIntegrante.read("Matheus Moreira Luna");
        System.out.println(integrante.toString());
    }
}
