package az.atlacademy.lesson29;

public class Result<T> {

    private String className;
    private T data;

    public Result() {
    }

    public Result(String className, T data) {
        this.className = className;
        this.data = data;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "className='" + className + '\'' +
                ", data=" + data +
                '}';
    }

}
