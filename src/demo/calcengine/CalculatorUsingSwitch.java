package demo.calcengine;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		double value1 = 100.0d;
        double value2 = 0.0d;
        double result = 0.0d;
        char opcode = 'd';
        
        switch (opcode) {
        case 'a':
        	result = value1+value2;
        	break;
        case 's':
        	result = value1-value2;
        	break;
        case 'm':
        	result = value1+value2;
        	break;
        case 'd':
        	result = value2 != 0?value1/value2:0.0d;
        	String finalstat = (result == 0.0d?"not divisble":"divisible");
        	System.out.println("The values are not "+finalstat);	
        	/*
        	 * An example of conditional assignment instead of nesting if inside case statement
        	 */
        	break;
        default:
        	System.out.println("Invalid Opcode "+opcode);
        	result = 0.0d;
        	break;
        }
        
        System.out.println("The result is "+result);	
        	

	}

}
