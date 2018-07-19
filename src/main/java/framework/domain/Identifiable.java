package framework.domain;

public interface Identifiable<T extends Entity<T>> {
    Identifier<T> getId();
}
