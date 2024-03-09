import java.util.Scanner;
public class HQ4 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int rows = hv.nextInt();
        System.out.println("Enter the no. of columns : ");
        int columns = hv.nextInt();
        double [][] a = new double[rows][columns];
        double [][] b = new double[rows][columns];
        double [][] c;

        System.out.println("Enter the values of 1st matrix : ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
                a[i][j] = hv.nextDouble();
        }

        System.out.println("Enter the values of 1st matrix : ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
                b[i][j] = hv.nextDouble();
        }

        System.out.println("The sum : ");
        c = addMatrix(a,b);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.print(c[i][j] + "\t");
            System.out.println();
        }
    }
    public static double[][] addMatrix(double[][]a, double [][]b)
    {
        int rows = a.length;
        int columns = a[0].length;
        double [][] c = new double[rows][columns];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}
