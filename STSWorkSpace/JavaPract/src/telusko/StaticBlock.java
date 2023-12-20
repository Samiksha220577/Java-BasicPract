package telusko;

class Mobile2{
	String brand;
	int price;
	String network;
	static String name;
	
	static {
		name="Phone";
		System.out.println("in static block");
	}
	
	public Mobile2() {
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor");
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	
}

public class StaticBlock {
	public static void main(String[] args)
	{
		
		//Class.forName("Mobile");
		
		Mobile2 obj1=new Mobile2();
		obj1.brand="Apple";
		obj1.price=1500;
		Mobile2.name="SmartPhone";
		obj1.show();
		Mobile2 obj2=new Mobile2();
		obj2.show();
		//System.out.println(obj1);
	

	
	}
}