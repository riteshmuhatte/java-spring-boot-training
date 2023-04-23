import java.io.IOException;

public class Maths {
	
	public void add(int a,int b) throws IOException {
		int result = a + b;
		System.out.println("The Addtion is "+ result);
	}
	
	public void substract(int a,int b) throws IOException {
		int result = a - b;
		System.out.println("The Substraction is "+ result);
	}
	
	public void multiply(int a,int b) {
		int result = a * b;
	    System.out.println("The Multiplication is "+ result);
	}
	
	public void division(int a,int b) {
		int result = a / b;
	    System.out.println("The Division is "+ result);
	}
	
	public void cube(int a) {
		int result = a * a * a;
	    System.out.println("The Cube is "+ result);
	}
	
	public void square(int a) {
		int result = a * a;
	    System.out.println("The Square is "+ result);
	}
}