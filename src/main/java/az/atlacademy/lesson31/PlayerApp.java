package az.atlacademy.lesson31;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerApp {

    public static void main(String[] args) {

        Player[] players = {new Player("Smith", 20),
                new Player("Jones", 15),
                new Player("Jones", 20)};

        System.out.println(Arrays.toString(players));
        Arrays.sort(players);
        System.out.println(Arrays.toString(players));
        System.out.println("===========");

        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new PlayerDescComparator());
        System.out.println(Arrays.toString(players));
        System.out.println("===========");

        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        System.out.println(Arrays.toString(players));
        System.out.println("===========");


        System.out.println(Arrays.toString(players));
        Arrays.sort(players, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(Arrays.toString(players));
        System.out.println("===========");

    }

}
