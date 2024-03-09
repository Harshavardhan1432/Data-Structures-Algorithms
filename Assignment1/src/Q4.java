import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String word = hv.next();
        for (int i = 0; i < word.length(); i++)
        {
            for (int j = 0; j < word.length(); j++)
            {
                for (int k = 0; k < word.length(); k++)
                {
                    if (i != j && j != k && k != i)
                        System.out.println("" + word.charAt(i) + word.charAt(j) + word.charAt(k));
                }
            }
        }
    }
}
