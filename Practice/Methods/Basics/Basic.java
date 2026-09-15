package javacore;

public class Basic {
	// a is a class variable
	int a = 200;
	
	void sample() {
		System.out.println("This is sample method");
	}
	void example() {
		System.out.println("This is example method");
	}
  public static void main(String[] args) {
	 System.out.println("The main method comes first");
	 int x= 20,y=30;
	 int c = x+y;
	 System.out.println("the sum is c: " + c);
	 
	 // object of basic class
	 Basic b = new Basic();
	 System.out.println("The class variable is: " + b.a);  // since its class variable we use object to call
	// call using oblect
	 b.sample();
	 b.example();
}
}