package az.atlacademy.module01.codewars;

public class ReversedStringsApp {


    public static String solution(String str) {
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            newString = str.charAt(i) + newString;
        }
        return newString;
    }

    public static void main(String[] args) {
        String world = solution("world");
        System.out.println(world);
    }

}
