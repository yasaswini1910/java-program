public class Constr {
    int a;
    public Constr(){
        this.a=10;
        System.out.println("constructor 2 executed");

    }
    void mul(){
        int b=5;
        System.out.println("Multiplication is : "+ (a*b));
    }
    float div(float b){
        return a/b;
    }
    public static void main(String[] args) {
       ConDemo con1 =new ConDemo(10, 5) ;
       Constr con2=new Constr();
       con1.add();
       System.out.println("Subtraction is : "+con1.sub(10, 5));
       con2.mul();
       System.out.println("Division is : "+ con2.div(5)); 
    }
}
class ConDemo{
    int x;
    int y;
    public ConDemo(int r,int n){
        this.x=r;
        this.y=n;
        System.out.println("constructor 1 executed");
    }
    void add (){
        System.out.println("Addition is : "+ (x+y));
    }
    int sub(int a,int b){
        return a-b;
    }
}