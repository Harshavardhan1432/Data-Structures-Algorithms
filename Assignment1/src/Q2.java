import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter person Weight in kg: ");
        double weight = hv.nextDouble();
        System.out.println("Enter height of person in meter: ");
        double height = hv.nextDouble();
        double bmi = weight/Math.pow(height,2);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 24.9)
            System.out.println("Normal Weight");
        else if (bmi < 29.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
        System.out.println("The calculated BMI : " + bmi);
    }
}
