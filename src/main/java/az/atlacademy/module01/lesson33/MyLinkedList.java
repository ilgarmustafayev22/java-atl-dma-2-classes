package az.atlacademy.module01.lesson33;

import java.util.NoSuchElementException;
import java.util.Optional;

public class MyLinkedList<E> {

    private MyNode<E> head;
    private int size = 0;

    public MyLinkedList(E data) {
        this.head = new MyNode<>(data);
        this.size = 1;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addTail(E data) {
        if (head == null) {
            head = new MyNode<>(data);
            return;
        }
        MyNode<E> curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(new MyNode<>(data));
        size++;
    }

    public void addHead(E data) {
        this.head = new MyNode<>(data, head);
        size++;
    }

    public void clear() {
        this.head = null;
        size = 0;
    }

    public void removeFirst() {
        head = head.getNext();
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot remove from an empty list");
        }
        if (size == 1) {
            head = null;
        } else {
            MyNode<E> curr = head;
            while (curr.getNext().getNext() != null) {
                curr = curr.getNext().getNext();
            }
            curr.setNext(null);
        }
        size--;
    }

    public Optional<E> findByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        int counter = 0;
        MyNode<E> curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
            counter++;
            if (index == counter) {
                return Optional.of(curr.getData());
            }
        }
        return Optional.empty();
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            MyNode<E> curr = head;
            for (int i = 0; i < size - 1; i++) {
                curr = curr.getNext();
            }
            curr.setNext(curr.getNext().getNext());
        }
        size--;
    }

    @Override
    public String toString() {
        String result = "[";
        MyNode<E> curr = head;
        while (curr != null) {
            result = result.concat(curr.toString()).concat(" - > ");
            curr = curr.getNext();
        }
        return result.concat("null]");
    }

}
