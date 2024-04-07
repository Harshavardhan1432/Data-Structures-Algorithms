class distance {
    int meters;
    int centimeters;

    distance(int m, int cm) {
        if (cm >= 100) {
            m += cm / 100;
            cm = cm % 100;
        }
        meters = m;
        centimeters = cm;
    }

    public void display() {
        System.out.println(meters + " m " + centimeters + " cm");
    }

    void sum(distance d1, distance d2) {
        this.meters = d1.meters + d2.meters;
        this.centimeters = d1.centimeters + d2.centimeters;
        if (this.centimeters > 100) {
            this.meters += this.centimeters / 100;
            this.centimeters %= 100;
        }
    }
}

public class HQ4 {
    public static void main(String[] args) {
        distance d1 = new distance(8, 53);
        distance d2 = new distance(2, 98);
        System.out.print("Distance D1 : ");
        d1.display();
        System.out.print("Distance D2 : ");
        d2.display();
        System.out.print("The Sum : ");
        d1.sum(d1, d2);
        d1.display();
    }
}
