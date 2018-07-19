package framework.events;

import framework.domain.Entity;

public class HasBeenDeleted<T extends Entity<T>> extends EntityEvent<T> {
    public HasBeenDeleted(T entity) {
        super(entity);
    }
}
