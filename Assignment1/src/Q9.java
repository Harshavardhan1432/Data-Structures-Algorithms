import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the values of rows : ");
        int rows = hv.nextInt();
        System.out.print("Enter the values of columns : ");
        int columns = hv.nextInt();

        double[][] arr = new double[rows][columns];
        if(rows == columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++)
                    arr[i][j] = hv.nextDouble();
            }
        }
        else
            System.out.println("To get the diagonal sum, no. of rows should be equal to no. of columns");

        System.out.println("The following 2D Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }

        System.out.println("Diagonal Sum : " + sumMajorDiagonal(arr));
    }
    public static double sumMajorDiagonal(double[][] m) {
        int rows = m.length;
        int columns = m[0].length;
        double sum = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++)
                    if (i == j)
                        sum += m[i][j];
            }
        return sum;
    }
}
