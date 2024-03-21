import java.util.Scanner;
class person
{
	String name;
	int age;
	public void setData()
	{
		Scanner hv = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = hv.nextLine();
		System.out.println("Enter Age : ");
		age = hv.nextInt();
		hv.close();
	}
	public void displayData()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
public class Q1 {

	public static void main(String[] args) {
		person p1 = new person();
		p1.name = "Harshavardhan";
		p1.age = 19;
		person p2 = new person();
		p2.setData();
		p1.displayData();
		p2.displayData();
		if (p1.age > p2.age)
			System.out.println(p1.name + " is older " + p2.name);
		else
			System.out.println(p2.name + " is older " + p1.name);
	}
}
