class Deposit
{
	long principle;
	int time;
	double rate;
	double totalAmt;
	Deposit()
	{
		
	}
	Deposit(long principle, int time, double rate)
	{
		this.principle = principle;
		this.time = time;
		this.rate = rate;
	}
	Deposit (long principle, int time)
	{
		this.principle = principle;
		this.time = time;
	}
	Deposit (long principle, double rate)
	{
		this.principle = principle;
		this.rate = rate;
	}
	void display()
	{
		System.out.println("Principle\t" + principle + "\tTime\t" + time + "\tRate\t" + rate + "\tTotal Amount\t" + calcAmt());
	}
	double calcAmt()
	{
		totalAmt = principle*time;
		return totalAmt + (principle*rate*time)/100;
	}
}
public class Q4 {
	public static void main(String [] args)
	{
		Deposit d1 = new Deposit();
		d1.display();
		d1.calcAmt();
		Deposit d2 = new Deposit(1000,2,5.0);
		d2.display();
		d2.calcAmt();
		Deposit d3 = new Deposit(2000, 5);
		d3.display();
		d3.calcAmt();
		Deposit d4 = new Deposit(3000, 10.5);
		d4.display();
		d4.calcAmt();
	}

}
