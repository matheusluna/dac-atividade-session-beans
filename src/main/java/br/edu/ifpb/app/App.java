/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.app;

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
        CPF cpf = new CPF("111.111.111-11");

        EntityManager manager = Persistence
                    .createEntityManagerFactory("dac-atividade-persistence")
                    .createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();
        //Método para persistir objeto
        Integrante integrante = new Integrante("Matheus Moreira Luna", cpf, LocalDate.of(1996, 4, 24));
        manager.persist(integrante);

        transaction.commit();
    }
}
