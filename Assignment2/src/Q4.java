class deposit {
    long principle;
    int time;
    double rate;
    double totalAmount;

    deposit() {
        this.principle = 50000;
        this.time = 2;
        this.rate = 11;
    }

    deposit(long a, int b, double c) {
        this.principle = a;
        this.time = b;
        this.rate = c;
    }

    deposit(long a, int b) {
        this.principle = a;
        this.time = b;
        this.rate = 10.6;
    }

    deposit(long a, double b) {
        this.principle = a;
        this.time = 2;
        this.rate = b;
    }

    void display() {
        System.out.println("Principle : " + principle);
        System.out.println("Rate : " + rate);
        System.out.println("time : " + time);
    }

    double calcAmt() {
        totalAmount = principle + (principle * rate * time) / 100;
        return totalAmount;
    }
}

public class Q4 {
    public static void main(String[] args) {
        deposit d1 = new deposit();
        d1.display();
        System.out.println("Total amount:" + d1.calcAmt() + "\n");

        deposit d2 = new deposit(10000, 5, 10);
        d2.display();
        System.out.println("Total amount:" + d2.calcAmt() + "\n");

        deposit d3 = new deposit(50000, 2);
        d3.display();
        System.out.println("Total amount:" + d3.calcAmt() + "\n");

        deposit d4 = new deposit(40000, 8.5);
        d4.display();
        System.out.println("Total amount:" + d4.calcAmt() + "\n");
    }
}
