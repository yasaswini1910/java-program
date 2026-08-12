public class Demo{
    int x=10;

    int addition(int y){
        return x+y; 
    }

    void sub(int y){
        System.out.println("subtraction is : "+(x-y));
    }

    void mul(){
        int y= 20;
        System.out.println("multiplication is : "+(x*y));
    }

    float divi(){
        float y=20;
        return x/y;
    }

    public static void main(String[] args) {
        Demo cl = new Demo();
        System.out.println("addition is : "+cl.addition(20));
        cl.sub(20);
        cl.mul();
        System.out.println("division is : "+cl.divi());
    }
}