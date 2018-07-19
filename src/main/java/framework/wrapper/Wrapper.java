package framework.wrapper;

public abstract class Wrapper <T> {
    public T getValue() {
        return value;
    }

    private T value;

    public Wrapper(T value){
        value =this.value;
    }


}
