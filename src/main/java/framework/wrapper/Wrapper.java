package framework.wrapper;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public abstract class Wrapper <T> {
    public T getValue() {
        return value;
    }

    @Column
    private T value;

    public Wrapper(T value){
        value =this.value;
    }

    // JPA Constructor
    protected Wrapper() {}
}
