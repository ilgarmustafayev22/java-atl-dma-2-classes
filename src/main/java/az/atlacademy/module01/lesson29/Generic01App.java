package az.atlacademy.module01.lesson29;

public class Generic01App {

    public static void main(String[] args) {
        Result<Object> objectResult = validateData(null);
        System.out.println(objectResult);

        Result<Integer> integerResult = validateData(1);
        System.out.println(integerResult);

        Result<String> a = validateData("A");
        System.out.println(a);
    }

    public static <T> Result<T> validateData(T data){
        if (data == null){
            return new Result<>();
        }
        return new Result<>(data.getClass().getName(), data);
    }

}
