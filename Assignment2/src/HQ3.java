class bank {
    static double amount;
    String bank_name;
    double deposit;

    void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    void setAmount(double deposit) {
        this.deposit = deposit;
    }

    void showData() {
        System.out.println(bank_name + "\t" + deposit);
    }

    void show_Min_Deposit_Bank(bank[] b) {
        double min_Deposit = Integer.MAX_VALUE;
        String min_bank_name = " ";
        for (int i = 0; i < 5; i++) {
            if (b[i].deposit < min_Deposit) {
                min_Deposit = b[i].deposit;
                min_bank_name = b[i].bank_name;
            }
        }
        System.out.println(min_bank_name);
    }
}

public class HQ3 {
    public static void main(String[] args) {
        bank[] b = new bank[2];
        {
            for (int i = 0; i < 5; i++)
                b[i] = new bank();
        }
        b[0].setBank_name("SBI");
        b[0].setAmount(123456);
        b[1].setBank_name("KVB");
        b[1].setAmount(56789);
        System.out.println("bank_name\tdeposit");
        for (int i = 0; i < 5; i++)
            b[i].showData();
        System.out.println("Total Amount deposited : " + bank.amount);
        b[0].show_Min_Deposit_Bank(b);
    }
}