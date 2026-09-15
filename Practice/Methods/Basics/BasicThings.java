package javacore;

public class BasicThings {
	//method without return
	void additon() {
		int x=25,y=34;
		System.out.println("The ADD is: " + x+y);
	}
	//method with return
	int sum(int a,int b,int c) {
		return a+b+c;
	}
	  
     public static void main(String[] args) {
		System.out.println("Hello this is main..");
		//object creation of class
		 BasicThings bt = new  BasicThings();
		 bt.additon();
		 int res= bt.sum(10, 200, 30);
		 System.out.println(" the sum from return type method is: " +res);
		 
	}
}
