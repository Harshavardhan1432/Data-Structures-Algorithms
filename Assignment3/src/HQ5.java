import java.util.Scanner;public class HQ5 {    public static void main(String[] args) {        Scanner obj = new Scanner(System.in);        System.out.println("Enter a string:");        String s = obj.nextLine();        String reversed = reverse(s);        System.out.println("Reversed string: " + reversed);    }    public static String reverse(String s) {        if (s.isEmpty())            return s;        return reverse(s.substring(1)) + s.charAt(0);    }}