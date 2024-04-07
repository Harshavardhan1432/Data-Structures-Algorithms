class pointType {
    double x;
    double y;

    pointType(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void setCoordinates() {
        this.x = 4;
        this.y = 0;
    }

    void printCoordinates() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }
}

class CircleType extends pointType {
    double radius;

    CircleType(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    void setRadius() {
        this.radius = 9;
    }

    void printRadius() {
        System.out.println("Radius : " + this.radius);
    }

    void printCenter() {
        System.out.println("Center : (" + this.x + "," + this.y + ")");
    }

    double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    double getCircumference() {
        return Math.PI * this.radius * 2;
    }
}

public class HQ5 {
    public static void main(String[] args) {
        pointType p = new pointType(6, 1);
        System.out.print("The Point = ");
        p.printCoordinates();
        p.setCoordinates();
        System.out.print("Now the point is = ");
        System.out.println("(" + p.getX() + "," + p.getY() + ")");
        CircleType c = new CircleType(3, 6, 2);
        c.printRadius();
        c.setRadius();
        System.out.println("Circle Area : " + c.getArea());
        System.out.println("Circle Circumference : " + c.getCircumference());
        c.printCenter();
    }
}
