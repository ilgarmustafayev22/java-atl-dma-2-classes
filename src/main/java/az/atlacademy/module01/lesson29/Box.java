package az.atlacademy.module01.lesson29;

public class Box<T> {

    private T data;
    private final boolean isEven;

    public Box(T data, boolean isEven) {
        this.data = data;
        this.isEven = isEven;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isEven() {
        return isEven;
    }

    @Override
    public String toString() {
        return "Box{data=%s, isEven=%s}".formatted(data, isEven);
    }

}
