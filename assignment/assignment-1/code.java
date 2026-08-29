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
class C extends B{
    
    int a=25;
    int b=25;
    public void mul(){
        System.out.println("multiplicatiom is"+(a*b));
    

    }

}
class D extends B{
    int a=100;
    int b=10;
    public void div(){
        System.out.println("division is " + (a/b));
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        D tv=new D();
    
        tv.sub();
        tv.div();

        
      
    }
    
}
