
class A{
    int a=100;
    int b=10;
    public void sum(){
        System.out.println("sum is"+(a+b));
    }
}
class B extends A{
    int a=10;
    int b=50;
    public void sub(){
        System.out.println("subtraction is " +(b-a));
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        B tv=new B();        
        tv.sum();
        tv.sub();
        
      
    }
    
}


    
