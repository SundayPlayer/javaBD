package client.domain;

import client.wrapper.BdAuthor;
import client.wrapper.BdName;
import framework.domain.Entity;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table
public class Bd extends Entity<Bd> {
    @Column
    private BdName BdName;

    @Column
    private BdAuthor BdAuthor;
}
