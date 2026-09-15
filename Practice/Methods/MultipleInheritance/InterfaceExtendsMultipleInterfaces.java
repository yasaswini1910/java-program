
package inheritance;
interface If1 {

	int x = 1;
	void one();
}
interface If2{
	int y = 2;
	
	void two();
}
interface If3 {

	int z = 3;
	void three();
}
interface If4 extends If1,If2,If3 {
	int a = 4;
	void four();
}
	
class Normal implements If4 {

	@Override
	public void one() {
		System.out.println(" one is from If1 extended by If4");
		
	}

	@Override
	public void two() {
		System.out.println(" two is from If2 extended by If4");
		
		
	}

	@Override
	public void three() {
		System.out.println(" three is from If3 extended by If4");
	}

	@Override
	public void four() {
		System.out.println(" four is from If4");
	}
	void NormalClass() {
		System.out.println(" from classs");
	}
}

public class InterfaceExtendsMultipleInterfaces {
public static void main(String[] args) {
	Normal n = new Normal();
	
	System.out.println(If4.x); 
	System.out.println(If4.y);
	System.out.println(If4.z);
	System.out.println(If4.a);
	n.one();
	n.two();
	n.three();
	n.four();
	n.NormalClass();
}
}
