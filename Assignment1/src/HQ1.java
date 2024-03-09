import java.util.Scanner;
public class HQ1 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        int a = hv.nextInt();
        int b = hv.nextInt();
        int c = hv.nextInt();
        boolean check = a + b == c && a == b - c && a * b == c;
        System.out.println(check);
    }
}

