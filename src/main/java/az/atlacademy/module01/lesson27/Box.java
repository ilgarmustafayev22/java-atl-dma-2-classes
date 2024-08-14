package az.atlacademy.module01.lesson27;

public class Box<T> {

    private T data;

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isEmpty() {
        return data == null;
    }

}
