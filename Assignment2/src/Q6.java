abstract class Marks {
    int markICP;
    int markDSA;
    double percentage;
}

class CSE extends Marks {
    int algoDesign;

    CSE(int a, int b, int c) {
        markICP = a;
        markDSA = b;
        algoDesign = c;
    }

    void getPercentage() {
        percentage = ((double) (markICP + markDSA + algoDesign) / 3);
    }
}

class NonCSE extends Marks {
    int engineering_Mechanics;

    NonCSE(int a, int b, int c) {
        markICP = a;
        markDSA = b;
        engineering_Mechanics = c;
    }

    void getPercentage() {
        percentage = (1.0 * (markICP + markDSA + engineering_Mechanics) / 3);
    }
}

public class Q6 {
    public static void main(String[] args) {
        CSE s1 = new CSE(70, 90, 88);
        s1.getPercentage();
        System.out.println("Percentage secured by the CSE student : " + s1.percentage);
        NonCSE s2 = new NonCSE(80, 69, 90);
        s2.getPercentage();
        System.out.println("Percentage secured by the NonCSE student : " + s2.percentage);
    }
}
