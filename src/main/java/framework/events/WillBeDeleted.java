package framework.events;

import framework.domain.Entity;

public class WillBeDeleted<T extends Entity<T>> extends EntityEvent<T> {
    public WillBeDeleted(T entity) {
        super(entity);
    }
}
