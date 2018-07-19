package client.wrapper;

import framework.wrapper.Wrapper;

import javax.persistence.Embeddable;

@Embeddable
public class BdAuthor extends Wrapper <String> {
    public BdAuthor(String value) {
        super(value);
    }

    // JPA Constructor
    protected BdAuthor() {}
}