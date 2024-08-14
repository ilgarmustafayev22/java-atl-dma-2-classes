package az.atlacademy.module01.lesson33;

public class MyLinkedListApp {

    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>(5);
        myLinkedList.addTail(90);
        myLinkedList.addTail(11);
        System.out.println(myLinkedList);
        myLinkedList.removeLast();
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getSize());
    }

}
