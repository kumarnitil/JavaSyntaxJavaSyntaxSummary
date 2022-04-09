package basics.java;

public class LearnString {
    public static void main(String[] args) {
        String A = "Kumar ";
        String B = "Nitil";
        String C = "Kumar Nitil";
        String D = A+B;
        String E = C.intern();//Will create the intern version of the string C
        String F = C.intern();//Will point F to the same interned version which means same reference and content
        if(C == D){
            System.out.println("True");//Will compare the reference where the strings are stored
        }
        if(C.equals(D)){
            System.out.println(" Equals True");//Will compare the contents of the Strings
        }
        if(!C.equals(D)){
            System.out.println(" Equals True");//Will compare the not equal contents of the Strings
        }
        else{
            System.out.println("Not !C is used to compare not equal of string contents");
        }
        if(E == F){
            System.out.println("Pointing to same reference Both the cases True");//Will compare the reference where the strings are stored
        }
        if(E.equals(F)){
            System.out.println("Same contents Both the cases True");//Will compare the reference where the strings are stored
        }

        /*
        String Conversion
        Any datatype can be converted into a string using ValueOf Method.
        Also there is a implicit conversion of string which a compiler can do.
         */
        int x = 100;
        String Conversion = String.valueOf(x);
        System.out.println(Conversion);
        int y = 200;
        String result = x + "+" + y;//Implicit conversion since "+" is used, then the conversion is implicit.
        System.out.println(result);

    }
}
