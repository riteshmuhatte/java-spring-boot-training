import java.io.IOException;

public class Entry {

	public static void main(String[] args) throws IOException {
	
		String programContinue = "Y";
		
		while(programContinue.equalsIgnoreCase("Y"))  {
			Menu.chooseOption();
		    int number = Menu.performAction();
		    Maths m = new Maths();
			
		    if (number == 1) {
		    	int num1 = Menu.firstNumber();
		    	int num2 = Menu.secondNumber();
		    	m.add(num1, num2);	    	
		    }
		    
		    else if (number == 2) {
		    	int num1 = Menu.firstNumber();
		    	int num2 = Menu.secondNumber();
		    	m.substract(num1, num2);	    	
		    }
		    
		    else if (number == 3) {
		    	int num1 = Menu.firstNumber();
		    	int num2 = Menu.secondNumber();
		    	m.multiply(num1, num2);	    	
		    }
		    
		    else if (number == 4) {
		    	int num1 = Menu.firstNumber();
		    	int num2 = Menu.secondNumber();
		    	m.division(num1, num2);	    	
		    }
		    
		    else if (number == 5) {
		    	int num1 = Menu.firstNumber();
		    	m.cube(num1);	    	
		    }
		    
		    else if (number == 6) {
		    	int num1 = Menu.firstNumber();
		    	m.square(num1);	    	
		    }	   	    
		    programContinue = Menu.programContinue();	    
		}
	}
}