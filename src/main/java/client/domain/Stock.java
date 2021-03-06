package client.domain;

import framework.domain.Entity;

import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@javax.persistence.Entity
@Table
public class Stock extends Entity<Stock> {

    @Column
    private Integer realQuantity;

    @Column
    private Integer previsionnalQuantity;

    @OneToOne(targetEntity = Bd.class)
    private Bd bd;
}
