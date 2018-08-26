/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.entidades;

import br.edu.ifpb.conversores.LocalDateConverter;
import br.edu.ifpb.enums.Estilo;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author mathe
 */
@Entity
@SequenceGenerator(
        name="seq_album",
        allocationSize = 1,
        initialValue = 1,
        sequenceName = "album_sequencia"
)
public class Album implements Serializable{
    @Enumerated(EnumType.STRING)
    private Estilo estilo;
    @OneToOne
    private Banda banda;
    @Convert(converter = LocalDateConverter.class)
    private LocalDate anoDeLançamento;
    @Id
    @GeneratedValue(generator = "seq_album", strategy = GenerationType.SEQUENCE)
    private Long ID;

    public Album() {
    }

    public Album(Estilo estilo, Banda banda, LocalDate anoDeLançamento) {
        this.estilo = estilo;
        this.banda = banda;
        this.anoDeLançamento = anoDeLançamento;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public LocalDate getAnoDeLançamento() {
        return anoDeLançamento;
    }

    public void setAnoDeLançamento(LocalDate anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.estilo);
        hash = 83 * hash + Objects.hashCode(this.banda);
        hash = 83 * hash + Objects.hashCode(this.anoDeLançamento);
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
        final Album other = (Album) obj;
        if (this.estilo != other.estilo) {
            return false;
        }
        if (!Objects.equals(this.banda, other.banda)) {
            return false;
        }
        if (!Objects.equals(this.anoDeLançamento, other.anoDeLançamento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Album{" + "estilo=" + estilo + ", banda=" + banda + ", anoDeLan\u00e7amento=" + anoDeLançamento + '}';
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    
}
