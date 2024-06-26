import java.util.Scanner;

class complex {
    int real;
    int imaginary;

    void setData() {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter value of real part");
        real = hv.nextInt();
        System.out.println("Enter value of imaginary part");
        imaginary = hv.nextInt();
    }

    void display() {
        System.out.println(real + " + " + imaginary + " i ");
    }

    complex add(complex c1, complex c2) {
        complex c3 = new complex();
        c3.real = c1.real + c2.real;
        c3.imaginary = c1.imaginary + c2.imaginary;
        return c3;
    }
}

public class Q2 {
    public static void main(String[] args) {
        complex c1 = new complex();
        c1.real = 2;
        c1.imaginary = 5;
        c1.display();

        complex c2 = new complex();
        c2.setData();
        c2.display();

        complex c = new complex();
        c = c.add(c1, c2);
        System.out.println("Addition of c1 and c2 is ");
        c.display();
    }
}
