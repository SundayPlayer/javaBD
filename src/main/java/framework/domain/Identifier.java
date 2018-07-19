package framework.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@JsonIdentityInfo(generator = ObjectIdGenerators.UUIDGenerator.class, property = "uuid")
@JsonIdentityReference(alwaysAsId = true)
@Embeddable
public class Identifier<T extends Entity<T>> implements Identifiable<T>, Serializable {
    @Column(name = "id")
    private UUID uuid;

    // JPA Constructor
    protected Identifier() {}

    public Identifier(UUID uuid) {
        this.uuid = uuid;
    }
    public Identifier(String uuid) {
        this.uuid = UUID.fromString(uuid);
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public final Identifier<T> getId() {
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Identifier<?>
                && ((Identifier<?>) obj).uuid.equals(this.uuid);
    }

    @Override
    public int hashCode() {
        return this.uuid.hashCode();
    }
}
