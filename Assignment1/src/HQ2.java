import java.util.Scanner;
public class HQ2 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = hv.nextInt();
        String [] str = new String[n+1];
        for (int i = 0; i <= n; i++)
            str[i] = hv.nextLine();
        for (int j = n; j >= 0; j--)
            System.out.println(str[j]);
    }
}
