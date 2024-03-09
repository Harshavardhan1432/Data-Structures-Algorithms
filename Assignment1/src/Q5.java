import java.util.Scanner;
public class Q5 {
        public static void main(String[] args) {
            Scanner hv = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int number = hv.nextInt();
            System.out.println("Sum of digits until single digit: " + sumOfDigits(number));
        }

        public static int sumOfDigits(int n) {
            while (n >= 10) {
                int sum = 0;
                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }
                n = sum;
            }
            return n;
        }
    }

