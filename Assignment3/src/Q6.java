public class Q6 {    public static void main(String[] args) {        Integer[] intArray = {1, 2, 3, 4, 5, 1, 2, 3};        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 1.1, 2.2};        String[] stringArray = {"apple", "banana", "apple", "orange", "apple"};        System.out.println("Occurrences of 3 in intArray: " + count(intArray, 3));        System.out.println("Occurrences of 1.1 in doubleArray: " + count(doubleArray, 2.2));        System.out.println("Occurrences of 'apple' in stringArray: " + count(stringArray, "apple"));    }    public static <T> int count(T[] array, T item) {        int count = 0;        for (T t : array) {            if (t.equals(item)) {                count++;            }        }        return count;    }}