package basics.java;

public class LearnConditionalLogic {

	public static void main(String[] args) {
		/*
		 * Relational Operator
		 * >
		 * >=
		 * <
		 * <=
		 * ==
		 * !=
		 */
		
		System.out.println('a'>'c');//This will print out false.
		/*
		 * When it comes to characters, the comparison actually uses the Unicode code point. 
		 * So the letter c has a larger Unicode code point than the letter a, so c is considered > a.
		 * Hence. the above statement will print false.
		 */
		
		//Conditional Assignment
		int value1 = 10;
		int value2 = 20;
		int lessvalue = value1<value2?value1:value2;
		/*
		 * The above example if of conditional assignment.
		 * if the logic before ? is true then first value before : is assigned else post : value is assigned.
		 * Hence the output will be 10 in the below statement.
		 */
		System.out.println(lessvalue);//This will print out the lesser of the value 10.
		
		/*
		 * Logical Operator
		 * & - And Operator
		 * | - OR Operator
		 * ^ - Exclusive OR or XOR
		 * ! - Negation Operator
		 */
		
		/*
		 * Conditional Logical Operator
		 * && - And Operator.
		 * || - OR Operator.
		 * The differences between Logical and Conditional Logical Operator
		 * && executes the right only when right is true
		 * || executes the right only when right is false.
		 */
		
		//Demo on how logical differs conditional logical operator
		int students = 150;
		int rooms = 0;
		
		/*
		 * if(students/rooms > 30)
		     System.out.println("Crowded Rooms");
		     Error - 
		     Exception in thread "main" java.lang.ArithmeticException: / by zero
	         at basics.java.LearnConditionalLogic.main(LearnConditionalLogic.java:55)
	         
	         This expression will throw an error as a number cannot be divided by 0.
	         Let us try solving it using &
		 *
		 */
		
		/*
		 * if(rooms > 0 & students/rooms > 30 )
			System.out.println("Crowded Rooms");
			This will still throw an error since both side of & are evaluated.
		 */
		
	     //The following will not throw an error though logically incorrect
		if(rooms > 0 && students/rooms > 30)
			System.out.println("Crowded Rooms");
		
		System.out.println("Expression on right of && is not executed");
			
		
		
		

	}

}
