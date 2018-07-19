package client.wrapper;

import framework.wrapper.Wrapper;

import javax.persistence.Embeddable;

@Embeddable
public class CustomerFirstName extends Wrapper<String> {
    public CustomerFirstName(String value) {
        super(value);
    }

    // JPA Constructor
    protected CustomerFirstName() {}
}
