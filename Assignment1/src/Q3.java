import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = hv.nextInt();
        int sum = 0, product = 1, temp = number, temp1 = number;
        while (temp != 0)
        {
            int r = temp % 10;
            sum += r;
            temp /= 10;
        }
        while (temp1 != 0) {
            int r = temp1 % 10;
            product *= r;
            temp1 /= 10;
        }
        if (product == sum)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");
    }
}
