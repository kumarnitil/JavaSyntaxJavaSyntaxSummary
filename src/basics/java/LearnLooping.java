package basics.java;

public class LearnLooping {

	public static void main(String[] args) {
		/*
		 * While loops may never executed if the condition is false
		 * Factorial of a number using while loop
		 */
		
		long num = 20, factorial = 1;
		final long  factorialnum = num;
		while(num > 1) { //condition has been added
			factorial *= num;
			num--;
		}
		
		//printf and not println is used for formatted printing in Java
		System.out.printf("The Factorial of %d is %d",factorialnum,factorial);
		
		/*
		 * do
		 * statement;
		 * while
		 * The body of the loop will be executed once irrespective of the condition.
		 */

		do {
			System.out.println("\nPrinted once even if condition false");
			System.out.printf("The Factorial of %d is %d",factorialnum,factorial);
		}while(factorialnum<20);
		
		      //Initialization of the array with the new keyword.
				int[] Array1 = new int[5];
				Array1[0] = 1;//Index of the Array starts with 0 and not 1 like Array1[0]
				Array1[1] = 2;
				Array1[2] = 3;
				Array1[3] = 4;
				Array1[4] = 5;
				
				//Using for each loop to print the values of this loop.	
				/*
				 * for each loop will take care of initialization
				 * for each loop will take care of traversal through each element.
				 */
				System.out.println("\nElements of Array 1 are");
				for(int Arrval :Array1) {
					System.out.println(Arrval);
				}
	}

}
