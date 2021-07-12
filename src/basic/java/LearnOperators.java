package basics.java;

public class LearnOperators {
	/* Operators can be divide into three categories - Basic, Prefix and Postfix and Compound Assignment Operator
	 * 1.>  basic operators, and these are generally what you think of as arithmetic operations, things like adding, multiplying, dividing, 
	 *      that sort of thing. And these arithmetic operators work very much like they do in traditional mathematics. 
	 *      You can simply apply the operators, and they'll produce a result.
	 * 2.>  the prefix and postfix operators, and these are operators that simply increment or decrement a value by 1. 
	 *      The key thing is when you apply these operators to a variable, they actually replace the variable's original value,
	 * 3.>   compound assignment operators. These also operate on a value, perform some calculation with that value, 
	 *       but at the end of the calculation, they replace the variable's original value with the result of the calculation.
	 */

	public static void main(String[] args) {
		//Basic operators are + - * / %
		// Division operators behaves differently with integer and float.
		int var1 = 10/6;
		System.out.println("The result of division of integers is quotient and not exact value like 10/6 will give "+var1);
		float var2 = 10.0f/6.0f;
		System.out.println("The result of division of decimals is thet exact value like 10.0/6.0 will give "+var2);
		int var3 = 10%6;
		System.out.println("The result of modulus of integers is remainder and converted to integer like 10%6 will give "+var3);
		float var4 = 10.0f%6.0f;
		System.out.println("The result of modulus of decimans is also remainder and converted to decimal like 10.0%6.0 will give"+var4);
		
		//postfix and prefix operators are ++ and --
		int var5 = 10, var6 = 10;
		System.out.println("The preincrement opeator will give increase the value by 1 and then assign and the result is "+ ++var5);
		System.out.println("The postincrement opeator will first assign value and then increment by 1 and the result is "+ var6++);
		int var7 = 10, var8 = 10;
		System.out.println("The predecrement opeator will give decrease the value by 1 and then assign and the result is "+ --var7);
		System.out.println("The postdecrement opeator will first assign value and then decrease by 1 and the result is "+ var8--);
		//var8 = 20++; Post and prefix cannot be used directly with number and will throw and error.
		float var9 = 10.0f;
		System.out.println("The result on a decimal number will be a decimal increased or decreaded by 1.0 and the result is "+ ++var9);
		
		
		//Compound Operators are += -= *= /= and %=
		int comp1 = 50, comp2 = 50, comp3 = 50, comp4 = 50, comp5 = 50;
		comp1 += 10;
		System.out.println("The result of += on variable with value of comp1 is "+ comp1);
		comp2 -= 10;
		System.out.println("The result of -= on variable with value of comp2 is "+ comp2);
		comp3 *= 10;
		System.out.println("The result of *= on variable with value of comp3 is "+ comp3);
		comp4 /= 10;
		System.out.println("The result of /= on variable with value of comp4 is "+ comp4);
		comp5 %= 10;
		System.out.println("The result of %= on variable with value of comp5 is "+ comp5);
	}

}
