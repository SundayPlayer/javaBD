package framework.events;

import framework.domain.Entity;

public class HasBeenUpdated<T extends Entity<T>> extends EntityEvent<T> {
    public HasBeenUpdated(T entity) {
        super(entity);
    }
}
