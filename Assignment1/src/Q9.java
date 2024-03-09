import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the values of rows : ");
        int rows = hv.nextInt();
        System.out.print("Enter the values of columns : ");
        int columns = hv.nextInt();

        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                arr[i][j] = hv.nextInt();
        }

        System.out.println("The following 2D Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }

        int sum1 = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j)
                    sum1 += arr[i][j];
            }
        }
        System.out.println("Diagonal Sum : " + sum1);
    }
}
