package demo.calcengine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double[] leftval = {100.0d, 200.0d, 300.0d, 400.0d};
        double[] rightval = {50.0d, 100.0d, 150.0d, 200.0d};
        char[] opcode = {'a','s','m','d'};
        double[] result = new double[opcode.length];
        
        if(args.length == 0) {
        for(int i=0;i<opcode.length;i++) {
        	result[i] = execute(opcode[i], leftval[i], rightval[i]);
        }
        System.out.println("The results are");
        for(double finalresult :result)	
        System.out.println(finalresult);
        }
        else if(args.length == 3)
        	commandlinehandler(args);
        else if(args.length == 1 && args[0].equals("Interactive")){
                executeInteractively();
		}
        else
        	System.out.println("Invalid number of arguments provided");
	}

	private static void executeInteractively() {
		System.out.println("Enter an operations and two numbers");
		Scanner scanner = new Scanner(System.in);//Since I have used System.in and this instance of scanner will take care
		//of getting details from the user
		//All I have to do is ask the scanner instance for that input and we will do that by calling scanner.nextline
		String input = scanner.nextLine();//Will read all the input till it hits the enter key
		String[] parts = input.split(" ");
		performoperations(parts);
	}

	private static void performoperations(String[] parts) {
		char opcode = opcodefromstring(parts[0]);
		double val1 = valuefromword(parts[1]);
		double val2 = valuefromword(parts[2]);
		double result = execute(opcode, val1, val2);
		System.out.println("The final result is "+result);
	}

	static double execute (char opscode, double leftval, double rightval) {
		double result;
		switch (opscode) {
        case 'a':
        	result = leftval+rightval;
        	break;
        case 's':
        	result = leftval-rightval;
        	break;
        case 'm':
        	result = leftval*rightval;
        	break;
        case 'd':
        	result = rightval != 0?leftval/rightval:0.0d;
        	String finalstat = (result == 0.0d?"not divisble":"divisible");
        	System.out.println("The values are "+finalstat);	
        	/*
        	 * An example of conditional assignment instead of nesting if inside case statement
        	 */
        	break;
        default:
        	System.out.println("Invalid Opcode "+opscode);
        	result = 0.0d;
        	break;
        }
		return result;

		
	}

	public static char opcodefromstring(String OperationName){
		char Opcode = OperationName.charAt(0);
		return Opcode;
	}

	public static double valuefromword(String word){
		String[] numberwords = {"zero", "one", "two", "three", "four", "five","six", "seven", "eight", "nine"};
		double digit = 0.0d;
		for(int i=0; i<numberwords.length;i++){
			if(word.equals(numberwords[i])){
				digit = i;
				break;
			}
		}
		return digit;
	}
	
	public static void commandlinehandler(String[] args) {
		char opscode = args[0].charAt(0);
		double leftval = Double.parseDouble(args[1]);
		double rightval = Double.parseDouble(args[2]);
		System.out.printf("The sum of %f and %f are",leftval,rightval);
		System.out.println(execute(opscode,leftval,rightval));
	}

}
