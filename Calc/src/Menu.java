import java.io.IOException;

public class Menu {
	
	public static void chooseOption() {
		System.out.println("1. Add Two Numbers");
	    System.out.println("2. Substract Two Numbers");
	    System.out.println("3. Multiply Two Numbers");
	    System.out.println("4. Divide Two Numbers");
	    System.out.println("5. Cube");
	    System.out.println("6. Square");
	}
	
	public static int performAction() throws IOException {
		int number = BasicInput.readInteger();
		return number;
	}
	
	public static int firstNumber() throws IOException {
		System.out.println("Please Enter first number");
		int num1 = BasicInput.readInteger();
		return num1;
	}
	
	public static int secondNumber() throws IOException {
		System.out.println("Please Enter Second number");
		int num2 = BasicInput.readInteger();
		return num2;
	}	
	
	public static String programContinue() throws IOException {
		System.out.println("Do you want to continue(Y/N)? ");
		String str = BasicInput.readString();
		return str;
	}	
}
