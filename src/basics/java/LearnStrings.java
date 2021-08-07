package basics.java;

public class LearnStrings {
	
	/*
	 * Strings are immutable
	 * 1.>String class stores a sequence of characters, these characters are Unicode characters, and technically, the storing of what's known as UTF 16 format,
	 *      and what that really means is that strings in Java can store pretty much any character in any language you're ever likely to have to work with.
	 * 2.>We always use double quotes to add values to the strings because string has the concept of literals and literals are specified in double 
	 *    quotes.  In our character types, we use single quotes.
	 * 3.> Now strings are what's known as immutable. What that means is the value of a string can never be directly changed instead, 
	 *     any changes to the value actually creates a new string instance in the memory.
	 * 4.> Immutable - strings are what's known as immutable. What that means is the value of a string can never be directly changed instead, 
	 *     any changes to the value actually creates a new string instance. Thus whenever a string is concatenated the value is not changed in the old
	 *     memory but a new memory space with the same value id allocated and the string variable points to the new memory.
	 * 5.> Check below the examples talking about string equality - '==' and 'equals'
	 *     In majority of the times equals method is the best choice for string comparison.
	 *     But doing the character by character comparison of the string is more expensive than checking if both the string variables are pointing 
	 *     to same memory instance and particularly the string which you are checking is a very long string.
	 *     Thus in cases where we have to check equality of string very frequently we have a concept called Intering a string.
	 *     The examples of interning the string has been shown below.
	 */

	public static void main(String[] args) {
		// Details on the string equality
		/*
		 * Below are the examples are of string comparison using equality operator '=='
		 * Checks to see if the both the string variables are referring to the same string instance or memory
		 * s1 and s2 are pointing to different memories.
		 */
		
		String s1 = "I";
		s1 += " Love Java";
		String s2 = "I Love";
		s2 += " Java";
		if(s1 == s2)
			System.out.println("True");
		else
			System.out.println("False");
		
		/*
		 * Thus to check the content of the string without referencing the memory is using 'equals' method.
		 * The equals method performs the character by character comparison of the two string variables
		 * Check the examples below and now we are going to get a return value of true instead false previously.	
		 */
		System.out.println(s1);
		System.out.println(s2);
		if(s1.equals(s2))
			System.out.println("True");
		else
			System.out.println("False");
		/*
		 * In this case the two strings are exactly the same in terms of assignment itself and thus in this case Java is smart enough to 
		 * point both the string variable to the same memory instance and hence the equality operator '==' will return a response of false.
		 */
		String s3 = "I Love";
		String s4 = "I Love";
		if(s3 == s4)
			System.out.println("True");
		else
			System.out.println("False");
		
		/*
		 * Interning a string.
		 * what string interning does is provide what's known as a canonicalized value. 
		 * And that's simply a fancy way of saying that when you intern a string,
		 * a string of any given value will always return back a reference to the same string instance.
		 * In other words the intern method what it does it that it will search the memory for the intern form of the value.
		 * Remember when I say intern form of the value because let us take an example the first time the intern method is used
		 * and the compiler is able to find the value but not the intern version it will create the intern version.
		 * In the second run if any other string is looking to get assigned to same value and would refer to the interned memory space
		 * Check the below examples to understand more clearly.
		 */
		
		String s5 = s1.intern();
		/*
		 * Here the compiler is going to two jobs.
		 * 1.> What the intern method does is, it looks at the value of the string and then
		 * 2.> and it looks around to see if there's already an interned version of that string. 
		 *     If it can't find one, it provides/creates that interned version.
		 *     So then s5 is set to reference the interned version of the string.
		 */
		String s6 = s2.intern();
		/*
		 * now if I say s6 = s2.intern, the intern method will look at the value of the string that s2 references, 
		 * and it'll look around for an interned version of that string
		 * and since by value of s1 and s2 are exactly the same in this case, it would find one
		 * It's the same version that s5 references. So s6 will now reference that same instance that s5 references 
		 * So with that, if we then say if s5 == s6, in this case, that will now return true.
		 */
		if(s5 == s6)
			System.out.println("Since s5 and s6 point to same interned referenve the answer is True");
		
		/*
		 * String Methods and String Conversions
		 * one of the key things that makes our string type different from the primitive types 
		 * is the string type is what's known as a class
		 * one of the key value of classes as it relates to the string type is that classes provide methods
		 * Refer to the web URL for details - https://www.w3schools.com/java/java_ref_string.asp
		 * Some of the string class methods and related Operation are given below.
		 * Operation							 					Method type
		 * Length								                    length
		 * Create a new string(s) from existing                     concat, replace, toLowerCase, toUpperCase, trim, split
		 * Extract Substring										charAt, substring
		 * Test substring											contains, endsWith, startsWith, indexOf, lastIndexOf
		 * Comparison												equals, equalsIgnoreCase, isEmpty, compareTo, compareToIgnoreCase
		 * Formatting												format
		 * String for non-string									valueOf
		 */

	}

}
