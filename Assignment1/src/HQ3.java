import java.util.Scanner;
public class HQ3 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = hv.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        int [] c = new int[n];
        System.out.println("Enter the elements of the first array");
        for (int i = 0; i < n; i++)
            a[i] = hv.nextInt();
        System.out.println("Enter the elements of the second array");
        for (int j = 0; j < n; j++)
            b[j] = hv.nextInt();
        for (int k = 0; k < n; k++) {
            c[k] = a[k] * b[k];
            System.out.print(c[k] + "\t");
        }
    }
}
