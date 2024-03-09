import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = hv.nextInt();
        int count = 0;
        if (a >= 2)
        {
            while (a > 2)
            {
                a /= 2;
                count++;
            }
            System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is " + count);
        }
    }
}
