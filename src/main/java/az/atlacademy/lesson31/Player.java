package az.atlacademy.lesson31;

import java.util.Objects;

public class Player implements Comparable<Player>{

    private String name;
    private Integer age;


    public Player(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Player player = (Player) object;
        return Objects.equals(name, player.name) && Objects.equals(age, player.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Player that) {
       if (this.age == that.age){
          return this.name.compareTo(that.name);
       }
      return Integer.compare(this.age, that.age);
    }

}
