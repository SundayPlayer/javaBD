package framework.events;

import framework.domain.Entity;

public class WillBeCreated<T extends Entity<T>> extends EntityEvent<T> {
    public WillBeCreated(T entity) {
        super(entity);
    }
}
