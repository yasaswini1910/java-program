package inheritance;
interface Interface1 {

	int x = 1;
	void demo1();
}
interface Interface2 extends Interface1{
	int y = 2;
	void sample1();
}
class Class1 implements Interface2{
	public void demo1() {
		System.out.println("this is demo ");
	}
	public void sample1() {
		System.out.println("this is sample");
	}
	void method1() {
		System.out.println("this is method from Class1");
	}
	
		
	
}
public class InterfaceExtendsInterface {
	
	
	   public static void main(String[] args) {
		   Class1 c1 = new Class1();
		   System.out.println(Interface2.x);
		   System.out.println(Interface2.y); 
		   c1.demo1();
		   c1.sample1();
		   c1.method1();
	}
	}
