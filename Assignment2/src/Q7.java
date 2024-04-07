interface DetailInfo {
    void display();

    void count();
}

class people implements DetailInfo {
    static int max_count;
    String name;

    people(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name of person = " + name);
        System.out.println("No. of character name contains = " + max_count);
    }

    public void count() {
        max_count = name.length();
    }
}

public class Q7 {

    public static void main(String[] args) {
        people p1 = new people("Chernobyl");
        p1.count();
        p1.display();
        people p2 = new people("Heisenberg");
        p2.count();
        p2.display();
    }

}

