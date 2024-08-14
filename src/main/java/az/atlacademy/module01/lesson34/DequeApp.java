package az.atlacademy.module01.lesson34;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {

   private static Deque<Operation> operations = new LinkedList<>();
    public static void main(String[] args) {
        doOperation();
        System.out.println(operations);
        doOperation();
        System.out.println(operations);;
        doOperation();
        System.out.println(operations);
        doOperation();
        System.out.println(operations);
        doOperation();
        System.out.println(operations);
        ctrlZ();
        System.out.println(operations);
        ctrlZ();
        System.out.println(operations);
        ctrlZ();
        System.out.println(operations);
        ctrlZ();
        System.out.println(operations);
    }

    public static Operation doOperation(){
        operations.push(Operation.getRandomOperation());
        return operations.peek();
    }

    public static void ctrlZ(){
        operations.pop();
    }

    public enum Operation {
        END,
        UNDO,
        REDO,
        HOME,
        ENTER,
        RENAME,
        DELETE;

        public static Operation getRandomOperation() {
            final int random = (int) (Math.random() * Operation.values().length);
            return Operation.values()[random];
        }

    }

}
