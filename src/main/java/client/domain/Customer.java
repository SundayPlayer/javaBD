package client.domain;

import client.wrapper.CustomerFirstName;
import client.wrapper.CustomerLastName;
import framework.domain.Entity;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@javax.persistence.Entity
@Table
public class Customer extends Entity<Customer> {

    @Column
    private CustomerFirstName firstName;

    @Column
    private CustomerLastName lastName;

    @OneToMany(mappedBy = "client", targetEntity = Commande.class)
    private Set<Commande> commandes;
}