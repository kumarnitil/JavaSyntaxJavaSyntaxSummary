package basics.java;

public class LearnMethods {

	public static void main(String[] args) {
		/*
		 * In Java Parameters are passed by value 
		 * Parameters receives receives a copy of original value.
		 * Thus the method changes to parameter values are within the method and not visible to outside of methods
		 * There are three why a method would end
		 * - there is no more code left to execute
		 * - Using a return statement as simple as return; can also work
		 * - Error occurred during execution
		 * 
		 * A method can return a single value
		 * - it can be a primitive type
		 * - it can be an array
		 * 
		 * Curly braces are 
		 */
		
		justAnotherMethod();//function call without any parameters
		findsum(2.0f,3.0f,2);//function call with three arguments
	}

	static void justAnotherMethod() {
		System.out.println("Just a function call");
	}
	
	static void findsum(float x, float y, int count) {
		if(count == 0)
			return;//execution of the return statement in between to stop function/method body execution
		for(int i=1;i<=count;i++)
		System.out.printf("%d.> Printing the sum of x + y = %f\n",i,x+y);
		
	}
	
	/*
	 * In Java method parameter are always passed by value and the next swap function will depict that.
	 */
      
	
	static void beforeswap(int org1, int org2) {
		
	}
	
	static void swap(int swap1, int swap2) {
		
	}
}
