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


	}

}
