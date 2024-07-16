package az.atlacademy.lesson33;

public class MyLinkedListApp {

    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>(5);
        myLinkedList.add(90);
        myLinkedList.add(11);

        System.out.println(myLinkedList);
    }

}
