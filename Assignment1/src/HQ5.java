import java.util.*;
public class HQ5 {
    public static void main(String[] args) {
        Random r = new Random();
        int [][] arr = new int[4][4];
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
                arr[i][j] = r.nextInt(0,2);
        }
        System.out.println("The Matrix : ");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }

        System.out.println("The largest row index : " + LargestRow(arr));
        System.out.println("The largest column index : " + LargestColumn(arr));
    }
    public static int LargestRow(int [][] a)
    {
        int rows = a.length;
        int columns = a[0].length;
        int count = 0, temp = 0, max = 0;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if(a[i][j] == 1)
                    count++;
            }
            if (count > temp)
            {
                temp = count;
                max = i;
            }
        }
        return max;
    }

    public static int LargestColumn(int [][] a)
    {
        int rows = a.length;
        int columns = a[0].length;
        int count = 0, temp = 0, max = 0;
        for (int i = 0; i < columns; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                if(a[i][j] == 1)
                    count++;
            }
            if (count > temp)
            {
                temp = count;
                max = i;
            }
        }
        return max;
    }
}

