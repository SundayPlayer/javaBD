package client.wrapper;

import framework.wrapper.Wrapper;

import javax.persistence.Embeddable;

@Embeddable
public class BdName extends Wrapper<String> {
    public BdName(String value) {
        super(value);
    }

    // JPA Constructor
    protected BdName() {}
}