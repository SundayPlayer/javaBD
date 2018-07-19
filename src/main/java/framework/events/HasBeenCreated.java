package framework.events;

import framework.domain.Entity;

public class HasBeenCreated<T extends Entity<T>> extends EntityEvent<T> {
    public HasBeenCreated(T entity) {
        super(entity);
    }
}
