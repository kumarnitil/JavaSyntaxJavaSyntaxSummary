package basics.java;

public class LearnTypeConversion {
	
	/*
	 * broadly speaking, conversions fall into two broad categories. 
	 * 1.> One is what we call implicit conversions, and that's a conversion that can be automatically performed by the compiler.
	 * 2.> explicit conversions, and explicit conversions are where we tell the compiler specifically what conversion we want to have occur, 
	 *     and we do that using what's called the cast operator.
	 *    
	 *    there are only certain kinds of conversions the compiler can perform implicitly, 
	 *    and these are what we call widening conversions. And conceptually what we're doing is going from one type to a wider type.
	 *    compiler will use whatever the largest integer in the equation is in case of implicit conversion.
	 *    if we had a short which is 16 bits and an int which is 32 bits, the compiler will implicitly convert the short to an int to use that in the equation.
	 *    there are only two floating point sizes, float and double. 
	 *    So any time we have mixed floating point sizes, in that equation the compiler's automatically going to use a double for all the float values.
	 *    
	 *    potential side effects that may occur that may not be what you want to have happen.
	 *    1.> One of the biggest one to consider is narrowing conversions, in other words, going from a wider type like a long to a narrower type like a short. 
	 *        Well, in that scenario, you may have a data value in that wider type, in that long, that won't fit into that short. Well, in that situation, 
	 *        the compiler will simply throw away any bits that don't fit. So you may end up with some unexpected behaviors in that situation.
	 *        Because the data value may actually get changed as a result of the cast, because the original data value won't fit into that narrower data type.
	 *    2.> next one we want to be aware of is casting a floating point to on integer. 
	 *        Remember that floating point values can have a fractional portion; integers can't.
	 *        So when you make this conversion, any fractional portion is simply discarded.
	 *    3.> finally, we have casting an integer to a floating point. In this situation, you may lose precision. 
	 *        In other words, the value may become less accurate. And this is tied to a nuance in the way floating point values are stored. 
	 *        So in this situation, an integer value of say, 100,000, when it gets converted to the floating point, 
	 *        rather than being an even 100,000, may be something like 99,999.9999. And that's just a nuance of how floating point values are stored.    
	 *   
	 */

	public static void main(String[] args) {
		float floatval = 1.0f;
		double doubleval = 4.0d;
		byte byteval = 7;
		short shortval = 10;
		long longval = 50;
		
		short result1 = byteval;//Implicit conversion.
		//short result2 = longval; -> No implicit conversion since short is smaller than long.
		//Resolved using explicit conversion
		short result2 = (short)longval;//explicit conversion using cast operator in short
		short result3 = (short)byteval;//this also works in byte conversion.
		System.out.println("The value of result3 is "+result3);
		
		//short result4 = byteval - longval; This will again give typemismatch error since in the equation all will be converted to long.
		//Solution has been shown below.
		short result4 = (short) (longval - byteval);
		System.out.println("The value of result4 is "+result4);
		
		//long result5 = longval - floatval; This will again throw an error. 
		//Solution is shown below.
		float result5 = longval - floatval;
		System.out.println("The value of result5 is "+result5);
		
		// float result6 = doubleval - floatval; Similarly error  and fixed below.
		double result6 = doubleval - floatval;
		System.out.println("The value of result6 is "+result6);
		
       //long result5 = shortVal - longVal + floatVal + doubleVal; will thrown an error
        long result7 = (long)(shortval - longval + floatval + doubleval);
       //Resolved using explicit conversion.
        System.out.println("The value of result7 is "+result7);
        
		System.out.print("Success");

	}

}
