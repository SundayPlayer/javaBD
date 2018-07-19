package client.domain;

import client.wrapper.CustomerFirstName;
import client.wrapper.CustomerLastName;
import framework.domain.Entity;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table
public class Customer extends Entity<Customer> {

    @Column
    private CustomerFirstName firstName;

    @Column
    private CustomerLastName lastName;
}
