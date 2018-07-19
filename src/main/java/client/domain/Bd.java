package client.domain;

import client.wrapper.BdAuthor;
import client.wrapper.BdName;
import framework.domain.Entity;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Collection;

@javax.persistence.Entity
@Table
public class Bd extends Entity<Bd> {
    @Column
    private BdName BdName;

    @Column
    private BdAuthor BdAuthor;

    @ManyToMany (mappedBy = "bds")
    private Collection<Commande> commandes;
}