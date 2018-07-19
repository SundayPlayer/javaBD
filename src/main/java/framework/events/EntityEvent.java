package framework.events;

import framework.domain.Entity;

abstract class EntityEvent<T extends Entity<T>> {
    private T entity;

    EntityEvent(T entity) {
        this.entity = entity;
    }

    public T getEntity() {
        return this.entity;
    }
}
