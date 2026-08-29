

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


public class MultiLevelInheritance {
    public static void main(String[] args) {
        C tv=new C();
    
        tv.sub();
        tv.mul();
        tv.sum();

        
      
    }
    
}


    
