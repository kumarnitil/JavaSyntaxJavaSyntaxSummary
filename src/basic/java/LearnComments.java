package basics.java;

public class LearnComments {
	/*
	 * Java supports three general types of comments.
	 * 1.> One is what we call the line comment, and that's indicated by the // characters. 
	 *     And the line comment tells the compiler to ignore the text until it reaches the end of the current line. 
	 *     Now, this is a case where the new line character actually matters. The compiler will ignore everything after the // until it reaches a new line character.
	 * 2.> Now, another type of comment is what we call the block comment. 
	 *     A block comment begins with a forwardslash* and continues until the *forwardslash is reached and all text within that block is ignored.
	 *     this allows us to have comments that start and end within a particular line or even span multiple lines.
	 * 3.> There's another type of comment known as a Javadoc comment. 
	 *     The Javadoc comment begins with /** and ends when it reaches the *forwardslash. 
	 *     Now, from the compiler standpoint, a Javadoc comment is treated just like a block comment, so all the text between the opening and closing characters are ignored by the compiler. 
	 *     But the key thing is that Javadoc comments could be used to generate documentation.
	 * 4.> You cannot nest a block comment inside a block comment.
	 *     But you can next a line comment inside a block comment
	 //Nested line comment inside a block comment
	 */
	
	/**
	 * This is the example of JavaDoc Comments
	 * These are used to generate documents but before that javadoc needs to be mapped.
	 * Click Project -> Generate Javadoc -> Path of the Javadoc.exe file - > Click Next -> Give the document name ->
	 * Click Finish and Yes to All.
	 * The path is - C:\Program Files\Java\jdk1.8.0_291\bin\javadoc.exe
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println("This is the first line");//This is a line comment
		/*
		 * This is a block comment
		 */
		  System.out./*This is also a block comment. Compiles without Error */println("This is the second line");
		  System.out.println("This is the third line");

	}

}
