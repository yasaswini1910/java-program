

interface I1{
    int x=100;
    int y=10;
    public void sum();
    public void sub();


}
interface I2{
    int a=25;
    int b=25;
    public void mul();
}
class Caluculation implements I1,I2{
    @Override
    public void sum()
    {
System.out.println("sum is"+(x+y));
    }
    @Override
    public void sub()
{
    System.out.println("subtraction is "+(x-y));
}
@Override
public void mul(){
    System.out.println("multiplication is "+(a*b));
}

}
public class Interfaces {
    public static void main(String[] args) {
    Caluculation tv=new Caluculation();
    tv.sum();
    tv.sub();
    tv.mul();
        
    }
    
}