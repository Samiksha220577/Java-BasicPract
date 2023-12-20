package telusko;

class Mobile3{
	String brand;
	int price;
	String network;
//	String name;
	static String name;
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	public static void show1(Mobile3 obj)
	{
//		System.out.println("in static method");
		System.out.println(obj.brand+" : "+ obj.price +" : "+obj.name);
	}
}

public class StaticMethod {
	public static void main(String[] args) 
	{
		Mobile3 obj1=new Mobile3();
		obj1.brand="Apple";
		obj1.price=1500;
		//obj1.name="SmartPhone";
		Mobile3.name="SmartPhone";
		
		Mobile3 obj2=new Mobile3();
		obj2.brand="Samsung";
		obj2.price=1700;
		//obj2.name="SmartPhone";
		Mobile3.name="SmartPhone";
		
		//obj1.name="Phone";
		Mobile3.name="SmartPhone";
		
		obj1.show();
		obj2.show();
		
		Mobile3.show1(obj1);
		
		//System.out.println(obj1.brand);

	
	}
}

