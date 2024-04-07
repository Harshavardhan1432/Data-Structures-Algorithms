import java.util.Scanner;

class commission {
    double sales;

    commission(double sales) {
        this.sales = sales;
    }

    public double getCommission() {
        if (sales < 0)
            System.out.println("Invalid Input");
        else if (sales < 100)
            return 0.02 * sales;
        else if (sales < 500)
            return 0.05 * sales;
        else
            return 0.08 * sales;
        return 0;
    }
}

public class HQ1 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the sales : ");
        double sales = hv.nextDouble();
        commission c = new commission(sales);
        double com = c.getCommission();
        if (com > 0)
            System.out.println("Your Commission is : " + com);
    }
}
