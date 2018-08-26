/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.entidades;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author mathe
 */
@Entity
@SequenceGenerator(
        name="seq_banda",
        allocationSize = 1,
        initialValue = 1,
        sequenceName = "banda_sequencia"
)
public class Banda implements Serializable{
    @Id
    @GeneratedValue(generator = "seq_banda", strategy = GenerationType.SEQUENCE)
    private long id;
    private String localDeOrigem;
    private String nomeFantasia;
    @OneToMany
    private List<Integrante> integrantes;

    public Banda() {
    }

    public Banda(long id, String localDeOrigem, String nomeFantasia, List<Integrante> integrantes) {
        this.id = id;
        this.localDeOrigem = localDeOrigem;
        this.nomeFantasia = nomeFantasia;
        this.integrantes = integrantes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocalDeOrigem() {
        return localDeOrigem;
    }

    public void setLocalDeOrigem(String localDeOrigem) {
        this.localDeOrigem = localDeOrigem;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public List<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 59 * hash + Objects.hashCode(this.localDeOrigem);
        hash = 59 * hash + Objects.hashCode(this.nomeFantasia);
        hash = 59 * hash + Objects.hashCode(this.integrantes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banda other = (Banda) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.localDeOrigem, other.localDeOrigem)) {
            return false;
        }
        if (!Objects.equals(this.nomeFantasia, other.nomeFantasia)) {
            return false;
        }
        if (!Objects.equals(this.integrantes, other.integrantes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Banda{" + "id=" + id + ", localDeOrigem=" + localDeOrigem + ", nomeFantasia=" + nomeFantasia + ", integrantes=" + integrantes + '}';
    }
    
}
