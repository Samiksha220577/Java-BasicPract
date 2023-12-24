package telusko;

 class A {
	public A(){
	System.out.println("A constructor");
	}
}

 class B extends A{
	public B(){
		System.out.println("B constructor");
	}
}
public class Super {

	public static void main(String[] args) {
		//B aobj = new A();
		B bobj = new B();
	}
}
