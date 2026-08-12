abstract class A1{
    void display(){
        System.out.println("THis is from Abstract class");
    }
    abstract void method();
}
// inheriting abstract class to normal class
class C1 extends A1{
    @Override
    void method(){
        System.out.println( "This is from class C1 overrided abstract method");
    }
}
interface I1{
    void method();
}
interface I2{
    void display();
}
// inheriting interfaces to a class
// alternate for multiple inheritance
class C2 implements I1,I2{
    public void method(){ 
        System.out.println("This is from interface I1");
    }
    public void display(){
        System.out.println("This is from interface I2");
    }
}
public class AbstractInterface{
    public static void main(String[] args) {
    C1 a = new C1();
    C2 i = new C2();
    a.display();
    a.method();
    i.method(); 
    i.display();
    }
}