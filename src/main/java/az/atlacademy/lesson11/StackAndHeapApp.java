package az.atlacademy.lesson11;

public class StackAndHeapApp {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        String word = "alma";

        String word2 = "alma";

        String word3 = new String("alma");

        String concat = word.concat("armud");

        String concat2 = word + "armud";

        System.out.println("===========");

        String concat3 = "A".concat("B").concat("C");

        System.out.println("===========");
        StringBuilder sb = new StringBuilder("A").append("B").append("C");

    }

}
