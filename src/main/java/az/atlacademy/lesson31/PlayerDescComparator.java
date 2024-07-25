package az.atlacademy.lesson31;

import java.util.Comparator;

public class PlayerDescComparator implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getName() == o2.getName()) {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
        return o1.getName().compareTo(o2.getName());
    }

}
