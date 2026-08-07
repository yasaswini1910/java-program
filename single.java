class A{
    int x=10;
    void method1(){
       System.out.println("output from class A="+(x+10));
    }
}
class B extends A{
    void method2(){
        System.out.println("output from class B");
    }
}
public class single {
    public static void main(String[] args){
        B obj=new B();
        obj.method2();
        obj.method1();
    }
}
