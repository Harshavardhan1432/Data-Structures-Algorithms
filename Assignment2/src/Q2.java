import java.util.Scanner;
class complex
{
	double real;
	double imag;
	public void setData()
	{
		Scanner hv = new Scanner(System.in);
		System.out.println("Enter the real part : ");
		real = hv.nextDouble();
		System.out.println("Enter the imaginary part :");
		imag = hv.nextDouble();
		hv.close();
	}
	public void displayData()
	{
		System.out.println("Complex : " + real + " Imaginary " + imag + "i");
	}
	public static complex add(complex c1, complex c2)
	{
		complex result = new complex();
		result.real = c1.real + c2.real;
		result.imag = c1.imag + c2.imag;
		return result;
	}
}
public class Q2 {
	public static void main(String [] args)
	{
		complex comp = new complex();
		complex comp2 = new complex();
		comp.setData();
		comp2.setData();
		comp.displayData();
		comp2.displayData();
		complex sum = complex.add(comp, comp2);
		sum.displayData();
	}
}
