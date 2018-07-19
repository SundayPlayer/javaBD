package client.domain;

import framework.domain.Entity;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Collection;

@javax.persistence.Entity
@Table
public class Commande extends Entity<Commande> {

    @ManyToMany
    private Collection<Bd> bds;

   @ManyToOne
    private Customer client;

    @Column
    LocalDateTime date;
}
