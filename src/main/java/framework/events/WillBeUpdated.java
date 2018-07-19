package framework.events;

import framework.domain.Entity;

public class WillBeUpdated<T extends Entity<T>> extends EntityEvent<T> {
    public WillBeUpdated(T entity) {
        super(entity);
    }
}
