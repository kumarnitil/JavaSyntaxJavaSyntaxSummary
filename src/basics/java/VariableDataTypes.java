package basics.java;

public class VariableDataTypes {
	/*
	 * The variable declared within the scope of a loop will be limited to the loop or body.
	 * 1.> Variables.
	 * 2.> Primitive Data Types.
	 * 3.> Primitive Data Type Storage.
	 * 
	 * 1.> Variables - are strongly typed name data storage.
	 *     By convention only letters and numbers to name the variables though Java compilers allows some symbols.
	 *     **Variable name cannot start with a number and compiler will throw an error
	 *     Use CamelCase. Start each word after the first with Caps.
	 *     
	 * 2.> Primitive Data Types
	 *     there are four categories of primitive data types. 
	 *     So there's the integer types, the floating point types, the character type, and the Boolean type.
	 *     primitive types in Java, those types are stored by value. That means that each variable gets its own independent copy of each value
	 *     So now, if we declare another variable otherValue and initialize it to be firstValue, that means another area of storage called otherValue is created.
	 *     There's no relationship between those two variables after the assignment is made    
	 *     Changing one value will not alter the other.
	 */
	public static void main(String[] args) {
		
		int myVar;//Example of uninitialized variable which means it has been declared but we cannot use its value.
		myVar = 50; //Initialized with a value
		System.out.println("myVar is"+myVar);
		int anotherVar = 100; //Declared and Initialized at the same time.
		myVar = anotherVar; //Changing the value of a variable
		System.out.println("myVar is"+myVar);
		final int finalVar = 200; //final keyword is used to prevent changing value of a variable
		System.out.println("finalVar is"+finalVar);
		/*
		 * But while using the final keyword with the variable we can declare it without value 
		 * and assign a value to it only once.
		 */
		
		final int finalVar1;
		finalVar1 = finalVar;
		//finalVar1 = 500; will throw an error.
		System.out.println("finalVar1 is"+finalVar1);
		
		/*
		 * Primitive Data types
		 */
		
		//Integer//
		byte data1 = 127;
		//byte type, and the byte type takes up simply 8 bits. And because it's so small, it can only store values between ‑128 and positive 127.
		System.out.println("byte is maximum upto "+data1+" minumum upto -128");
		short data2 = 32000;
		//short integer type. That takes up 16 bits, and because it's larger it can store a larger range of values, so from ‑32,000 to positive 32,000.
		System.out.println("short is maximum upto "+data2+" minumum upto -32000");
		int data3 = 32;
		System.out.println("The size of int datatype is "+data3+" bits");
		/*
		 *  int type. Now int is probably the most commonly used integer data type. 
		 *  Its size is 32 bits, and it can store between ‑2 billion and positive. 2 billion. 
		 *  So I have a variable here, milesToSun, its type is int, and I assign it an initial value of 92,960,000.
		 */
		long data4 = 64l;
		System.out.println("The size of long datatype is "+data4+" bits and it declared using the long literal (l) at the end" );
		/*
		 *  long, and that's a 64‑bit integer. Now as you can see, that can store really, really large positive values or really, really small negative values. 
		 *  Now the thing to notice about longs is the literal format. 
		 *  When you want to set a long literal, you have to put the letter l at the end of the value.
		 */
		
		//floating
		/*
		 * float data type
		 * we have our floating point types, and floating point types simply have the ability to store values to have a fractional portion. 
		 * In other words, they store decimal values. And there are two floating point types. The smallest one is what's called a float. 
		 * That's a 32‑bit value, and you can see the value range there. The key thing to note about floats is that when we specify literals, they have to have the letter f after them. So if I declare a variable here kilometersInAMarathon, its type is float, I set it to 42.195, 
		 * then we use the letter f to indicate that this literal is of type float.
		 */
		float float1 = 1132.11f;
		System.out.println("The size of float datatype is 32 bits and stores decimal value which is "+float1+" uses f literal at the end");
		
		/*
		 * double data type
		 * the double, again, can contain a fractional portion, but you notice it takes up 64 bits. So it allows you to have a much larger range of values.
		 * When you specify the literals for a double, you can simply specify a literal that contains a decimal. In that case, it's automatically a double. 
		 * Or you can explicitly indicate that it's a double by putting a d at the end of it.
		 */
		double double1 = 1132.11d;
		double double2 = 1131.11;
		System.out.println("The size of double datatype is 64 bits and stores decimal value which is "+double1+" uses d literal at the end");
		System.out.println("The size of double datatype is 64 bits and stores decimal value which is "+double2+" or simply use decimal format to declare a double");
		
		//Characters
		/*
		 * char data type
		 * character data type stores a single Unicode character. Note that it's a single character; it's not a string of characters. We'll talk about strings a little bit later in the course. 
		 * Now when we specify the character types, the literals are placed within single quotes.
		 * So you notice here I declare a variable whose name is regularU, its type is char because char is the name of the type that's used to store a single character. 
		 * And we give it that initial value, the letter U enclosed between single quotes. 
		 * Now note that this type stores Unicode characters, so it stores the full range of Unicode characters, which means it can store values that aren't necessarily on your keyboard. 
		 * So because of that, we can actually use what are called Unicode code points to specify a value. 
		 * And that simply means we can use the numeric representation of a Unicode character. We do you that by using a \\u, (only one back slash, the first is to escape sequence) followed by the four‑digit hex code. So here I have a variable name accentedU. 
		 * Its type is character, and I want it to store the capital U with an accent. 
		 * \\I don't have that on my keyboard, so I can simply specify its value is \u00DA, the hexadecimal representation of that character, and all that's enclosed in single quotes. 
		 * So when I display this with in my application, I actually get that uppercase U with an accent.
		 */
		
		char char1 = '\u00DA';
		System.out.println("The char datatype can store any Unicode character and here the value of char1 us  "+char1);
		
		//Boolean
		/*boolean data type
		 * The Boolean type is simply a type that can store true and false values. Its literals are the word true and the word false. 
		 * So here I've declared a variable I love Java, its type is Boolean, and I give it an initial value of true.
		 */
		
        boolean bool1 = true;
        System.out.println("The boolean datatype can store only trur or false. Say! Coding is life Me:"+bool1);
        
        
				
		
	}

    public static class calculator {

        /*
         * Creation of simple calculator which would do
         * +, -, /, %
         */

        public static void main(String[] args) {
            double value1 = 100.0d;
            double value2 = 0.0d;
            double result = 0.0d;
            char opcode = 'f';

            if(opcode=='a')
                result = value1+value2;
            else if(opcode=='s')
                result = value1-value2;
            else if(opcode=='m')
                result = value1*value2;
            else if(opcode=='d') {
                if(value2 != 0)
                result = value1/value2;
            }
            else {
                System.out.println("Invalid Opcode "+opcode);
                result = 0.0d;
            }


        }

        public static class CalculatorUsingArrays {

            public static void main(String[] args) {
                double[] leftval = {100.0d, 200.0d, 300.0d, 400.0d};
                double[] rightval = {50.0d, 100.0d, 150.0d, 200.0d};
                char[] opcode = {'a','s','m','d'};
                double[] result = new double[opcode.length];

                for(int i=0;i<opcode.length;i++) {
                switch (opcode[i]) {
                case 'a':
                    result[i] = leftval[i]+rightval[i];
                    break;
                case 's':
                    result[i] = leftval[i]-rightval[i];
                    break;
                case 'm':
                    result[i] = leftval[i]*rightval[i];
                    break;
                case 'd':
                    result[i] = rightval[i] != 0?leftval[i]/rightval[i]:0.0d;
                    String finalstat = (result[i] == 0.0d?"not divisble":"divisible");
                    System.out.println("The values are "+finalstat);
                    /*
                     * An example of conditional assignment instead of nesting if inside case statement
                     */
                    break;
                default:
                    System.out.println("Invalid Opcode "+opcode);
                    result[i] = 0.0d;
                    break;
                }
                }
                System.out.println("The results are");
                for(double finalresult :result)
                System.out.println(finalresult);

            }

        }
    }
}
