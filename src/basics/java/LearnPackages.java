package basics.java;

public class LearnPackages {
	/*
	 *  1.> One of the key things packages do is provide organization. 
	 *      Now they also follow a standard naming convention, and as we'll see, that naming convention assures that our package names are unique. 
	 *      And also, package names affect where our source code is structured.
	 *  2.> package names are all lowercase, and they use something known as reverse domain name notation. 
	 *      And this notation assures global uniqueness of our package names.
	 *  3.> By our package names being unique, it helps make our type names unique because type names are qualified by their package.
	 *      Let us try to understand what a type name is 
	 *      Type is basically the fully qualified class name. For example -  we had a class named Main that was not part of a package, well, the name of that type would simply be Main.
	 *      But by placing it in a package, that now qualifies the name within the package. So by putting our class Main inside the package name com.pluralsight.example, the name of the type is now com.pluralsight.example.main.
	 *      So because our package names are globally unique, it now allows our type names to be globally unique.
	 *      Thus while compiling from the command prompt make sure to use FQDN name.
	 */

	public static void main(String[] args) {
		System.out.println("Updated the Comments");

	}

}
