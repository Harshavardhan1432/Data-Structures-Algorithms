public class Q5 {    public static void main(String[] args) {        Integer[] intArray = {1, 2, 3, 4, 5};        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};        String[] strArray = {"Hello", "World", "JAVA"};        System.out.println("Array of Integers:");        printArray(intArray);        System.out.println("\nArray of Doubles:");        printArray(doubleArray);        System.out.println("\nArray of Characters:");        printArray(charArray);        System.out.println("\nArray of Strings:");        printArray(strArray);    }    public static <E> void printArray(E[] inputArray) {        for (E e : inputArray) {            System.out.print(e + " ");        }        System.out.println();    }}