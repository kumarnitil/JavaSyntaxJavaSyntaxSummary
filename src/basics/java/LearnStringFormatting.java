package basics.java;

public class LearnStringFormatting {

	public static void main(String[] args) {
		/* String formattter can be supported by three methods.
		* String.format, which allows us to construct a string using these format specifiers.
		* System.out.printf, which allow us to display formatted content.
		* Formatter class, which will allow us to output formatted content to pretty much anything you can think of, a file, a network, just about anything.
		* Formatter.format
		*/
        
		//Concetation vs Formatting
		int age = 10;
		//Concetation
		String Conces = "The age is " + age;
		System.out.println(Conces);
		//Formatting
		String Concesb = String.format("The age is %d", age);
        System.out.println(Concesb);
        //String formatter will also helps us in printing the precision of values to a certain level.
		//Check the example below.
		double precision = 1234563.7777d;
		String precisionoutput = String.format("The precesion value is %.2f ", precision);
		System.out.println(precisionoutput);

		/*
		Parts of the format Specifier
		%[arguement Index][flags][width][precision]conversion
		d = decimal conversion
		x or X = Hex conversion of an integer value
		f = decimal conversion of floating point values
		e or E = scientific notation of floating point values
		s = string conversion
		 */

		//Format Flags: #
		//Format flag # will let you know the actual base of the number
		/*
		Flag ----------- Meaning
		#				 Include Radix as shown below.
		0                Zero Padding
		-                Left Justify
		,  	             Include Grouping Separator
		space            Leading space when positive number
		+ 				 Always Show sign
		(  				 Enclose negative values in parenthesis
		 */
		int testvalue = 32;
		int testvalux = 1234567;
		String testvalue1 = String.format("%d", testvalue);
		String testvalue2 = String.format("%x", testvalue);
		String testvalue3 = String.format("%#x", testvalue);
		System.out.println(testvalue1);//Print the decimal or integer format
		System.out.println(testvalue2);//Print the hexagon format but the end user will not know its in hexagon format
		System.out.println(testvalue3);//print the and the end user will also know
		String testvalue4 = String.format("%4d", testvalue);
		String testvalue5 = String.format("%04d", testvalue);
		System.out.println(testvalue4);//Will have  a width of 4 digits
		System.out.println(testvalue5);
		String testvalue6 = String.format("%-4d", testvalue);
		System.out.println(testvalue6+testvalue);//Will give the width from the left side
		String testvalue7 = String.format("%,d", testvalux);
		System.out.println(testvalue7);//The value will be comma separated for better readability
		//Comma separator can also be applied on decimal values.
		String testvalue8 = String.format("%,.2f", precision);
		System.out.println(testvalue8);
		int positive = 123;
		int negative = -456;
		System.out.printf("This will print values with the sign %+d\n",positive);//Displays positive number with sign
		System.out.printf("This will print values with the sign %+d\n",negative);//Displays negative number with sign
		System.out.printf("This will print values with the sign % (d\n",positive);
		System.out.printf("This will print values with the sign % (d\n",negative);//Enclose negative number in paranthesis.

		/*
		Argument Index - It allows us to associate a particular format specifies with a particular argument
		Not Specified - Corresponds sequentially to argument which means first number is for first format specifier
		index$ - Index of argument to use(1-Based) Like 1$ corresponds to the first argument value.
		< - I will have what he is having argument Index which is a way of saying - "Corresponds to the same argument
		as previous format specifier
		 */
		int valA = 100, valB = 200, valC = 300;
		System.out.printf("%d %d %d\n",valA,valB,valC);
		System.out.printf("%2$d %1$d %3$d\n",valA,valB,valC);//Changed the order in which arguments was picked by
		//using the index$ here
		System.out.printf("%2$d %<d %1$d\n",valA,valB,valC);//< specifies that give me the previous argument

	}

}
