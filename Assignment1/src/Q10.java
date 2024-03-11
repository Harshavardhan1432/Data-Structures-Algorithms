import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the elements of 3 X 4 Matrix");
        double [][] arr = new double[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++)
                arr[i][j] = hv.nextDouble();
        }

        System.out.println("The following 2D Matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }

        for (int j = 0; j < 4; j++)
            System.out.println("Sum of the elements at column " + j + " is "+ sumColumn(arr,j));
    }


    public static double sumColumn(double[][] m, int columnIndex)
    {
        double sum = 0;
        for (int i = 0; i < 3; i++)
            sum += m[i][columnIndex];
        return sum;
    }
}

