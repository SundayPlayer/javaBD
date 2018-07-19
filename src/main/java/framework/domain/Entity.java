package framework.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.UUID;

@javax.persistence.Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Entity<T extends Entity<T>> implements Identifiable<T> {
    @EmbeddedId
    private Identifier<T> identifier;

    protected Entity() {
        this.identifier = new Identifier<>(UUID.randomUUID());
    }

    @Override
    public final Identifier<T> getId() {
        return this.identifier;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Entity<?>
                && ((Entity<?>) obj).identifier.equals(this.identifier);
    }

    @Override
    public int hashCode() {
        return this.identifier.hashCode();
    }
}
