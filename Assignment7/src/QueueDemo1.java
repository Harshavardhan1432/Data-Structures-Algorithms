import java.util.Scanner;

public class QueueDemo1 {
    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;
    public static Scanner scanner = new Scanner(System.in);

    public static <T> void insert(Object[] Q, Class<?> clazz) {
        if (isFull()) {
            System.out.println("Queue is full, Cannot insert element.");
            return;
        }
        System.out.println("Enter the element to insert:");
        T element = getInput((Class<T>) clazz);
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % MAX;
        Q[rear] = element;
        System.out.println("Element " + element + " inserted successfully.");
    }

    public static <T> void delete(T[] Q) {
        if (isEmpty()) {
            System.out.println("Queue is empty, Cannot delete element...");
            return;
        }
        System.out.println("Element " + Q[front] + " deleted successfully.");
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % MAX;
        }
    }

    public static <T> void display(T[] Q) {
        if (isEmpty()) {
            System.out.println("Queue is empty...Nothing to display");
            return;
        }
        System.out.println("Elements in the queue:");
        for (int i = front; ; i = (i + 1) % MAX) {
            System.out.print(Q[i] + " <- ");
            if (i == rear) break;
        }
        System.out.println();
    }

    public static boolean isFull() {
        return (rear + 1) % MAX == front;
    }

    public static boolean isEmpty() {
        return front == -1;
    }

    public static <T> T getInput(Class<T> clazz) {
        if (clazz == Integer.class) return clazz.cast(scanner.nextInt());
        if (clazz == Double.class) return clazz.cast(scanner.nextDouble());
        if (clazz == String.class) return clazz.cast(scanner.next());
        throw new IllegalArgumentException("Unsupported type");
    }

    public static void main(String[] args) {
        Object[] queue = new Object[MAX];
        System.out.println("Enter the type of elements in the queue (Integer, Double, String):");
        String type = scanner.next();
        Class<?> clazz = switch (type) {
            case "Integer" -> Integer.class;
            case "Double" -> Double.class;
            case "String" -> String.class;
            default -> throw new IllegalArgumentException("Unsupported type");
        };

        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> insert(queue, clazz);
                case 2 -> delete(queue);
                case 3 -> display(queue);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
