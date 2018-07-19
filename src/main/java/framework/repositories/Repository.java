package framework.repositories;

import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.jpa.impl.JPAQuery;
import framework.domain.Entity;
import framework.domain.Identifier;
import framework.events.*;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.function.Function;

public abstract class Repository<T extends Entity<T>> {
    @PersistenceContext(unitName = "test")
    private EntityManager em;

    @Inject
    private Event<WillBeCreated<T>> willBeCreatedEvent;
    @Inject
    private Event<HasBeenCreated<T>> hasBeenCreatedEvent;
    @Inject
    private Event<WillBeUpdated<T>> willBeUpdatedEvent;
    @Inject
    private Event<HasBeenUpdated<T>> hasBeenUpdatedEvent;
    @Inject
    private Event<WillBeDeleted<T>> willBeDeletedEvent;
    @Inject
    private Event<HasBeenDeleted<T>> hasBeenDeletedEvent;

    public List<T> query(Function<JPAQuery<T>, JPAQuery<T>> query) {
        return query
                .apply(new JPAQuery<>(em))
                .fetch();
    }

    public void create(T entity) {
        willBeCreatedEvent.fire(new WillBeCreated<>(entity));
        em.persist(entity);
        em.flush();
        hasBeenCreatedEvent.fire(new HasBeenCreated<>(entity));
    }

    public void update(T entity) {
        willBeUpdatedEvent.fire(new WillBeUpdated<>(entity));
        em.merge(entity);
        em.flush();
        hasBeenUpdatedEvent.fire(new HasBeenUpdated<>(entity));
    }

    public void delete(T entity) {
        willBeDeletedEvent.fire(new WillBeDeleted<>(entity));
        em.remove(entity);
        em.flush();
        hasBeenDeletedEvent.fire(new HasBeenDeleted<>(entity));
    }

    public <U extends EntityPathBase<T>> List<T> getAll(U model) {
        JPAQuery<T> query = new JPAQuery<>(em);
        return query
                .select(model)
                .from(model)
                .fetch();
    }
    public <U extends EntityPathBase<T>> T get(U model, Identifier<T> identifier) {
        JPAQuery<T> query = new JPAQuery<>(em);
        return query
                .select(model)
                .from(model)
                .fetchOne();
    }
}
