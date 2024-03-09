import java.util.Arrays;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = hv.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < size; i++)
            array[i] = hv.nextInt();
        Arrays.sort(array);
        System.out.println("Maximum : " + Max(array));
        System.out.println("Minimum : " + Min(array));
        System.out.println("Maximum Occurrence : " + Arrays.toString(MaxOcc(array)));
        System.out.println("Minimum Occurrence : " + Arrays.toString(MinOcc(array)));

    }

    public static int Max(int[] n) {
        return n[n.length - 1];
    }

    public static int Min(int[] n)
    {
        return n[0];
    }
    public static int [] MaxOcc (int [] n)
    {
        int count = 0, mc = 0;
        for (int j : n) {
            if (n[j] == Max(n)) {
                count++;
                mc = j;
            }
        }
        return new int[]{count, mc+1};
    }
    public static int [] MinOcc (int [] n)
    {
        int count = 0, mc = 0;
        for (int i : n)
        {
            if (n[i] == Max(n)) {
                count++;
                mc = i;
            }
        }
        return new int[]{count, mc+1};
    }
}
