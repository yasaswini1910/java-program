package javacore;
 class Sample{
	 int a;
	 float b;
	 char c;
	 String s;
	 public int getA() {
		 return a;
	 }
	 public void setA(int a) {
		 this.a = a;
	 }
	 public float getB() {
		 return b;
	 }
	 public void setB(float b) {
		 this.b = b;
	 }
	 public char getC() {
		 return c;
	 }
	 public void setC(char c) {
		 this.c = c;
	 }
	 public String getS() {
		 return s;
	 }
	 public void setS(String s) {
		 this.s = s;
	 } 
	 
 }
 
public class TestDemo {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.setA(1000);
		s.setB(23);
		s.setC('c');
		s.setS("haarika");
		System.out.println(s.getA());
		System.out.println(s.getB());
		System.out.println(s.getC());
		System.out.println(s.getS());
		}

}
