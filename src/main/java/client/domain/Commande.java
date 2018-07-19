package client.domain;

import framework.domain.Entity;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;

@javax.persistence.Entity
@Table
public class Commande extends Entity<Commande> {
    @Column
    private Bd bd;

    @Column
    private Client client;

    @Column
    LocalDateTime date;
}
