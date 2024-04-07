class book {
    String book_name;
    String book_edition;
    double book_price;

    book(String book_name, String book_edition, double book_price) {
        this.book_name = book_name;
        this.book_edition = book_edition;
        this.book_price = book_price;
    }

    void display() {
        System.out.println(book_name + "\t" + book_edition + "\t" + book_price);
    }
}

public class HQ2 {
    public static void main(String[] args) {
        book[] b = new book[3];
        b[0] = new book("ICP", "9e", 900);
        b[1] = new book("DSA", "6e", 890);
        b[2] = new book("CyberSecurity", "13e", 1090);
        System.out.println();
        System.out.println();
        int mp = 0;
        for (int i = 0; i < 5; i++) {
            if (b[i].book_price > b[0].book_price)
                mp = i;
        }
        b[mp].display();
    }
}
