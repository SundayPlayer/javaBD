package client.wrapper;

import framework.wrapper.Wrapper;

import javax.persistence.Embeddable;

@Embeddable
public class CustomerLastName extends Wrapper<String> {
    public CustomerLastName(String value) {
        super(value);
    }

    // JPA Constructor
    protected CustomerLastName() {}
}
