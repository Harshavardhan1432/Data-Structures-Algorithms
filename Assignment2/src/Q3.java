class product
{
	int prodid;
	double price;
	int quantity;
	public static double totalprice = 0;
	public product(int prodid, double price, int quantity)
	{
		this.prodid = prodid;
		this.price = price;
		this.quantity = quantity;
		totalprice += (price * quantity);
	}
	public void display()
	{
		System.out.println("Product ID : " + prodid);
		System.out.println("Quantity : " + quantity);
		System.out.println("Price per Unit : " + price);
	}
}
public class Q3 {

	public static void main(String[] args) {
		product p1 = new product(1,2,3);
		product p2 = new product(3,4,5);
		product p3 = new product(4,5,6);
		product p4 = new product(5,6,7);
		product p5 = new product(6,7,8);
		System.out.println("Details of purchased product");
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
        System.out.println("Total Price is : " + product.totalprice);
	}

}
