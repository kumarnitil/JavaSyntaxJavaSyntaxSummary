package basics.java;

public class LearnString {
    public static void main(String[] args) {
        String A = "Kumar ";
        String B = "Nitil";
        String C = "Kumar Nitil";
        String D = A+B;
        if(C == D){
            System.out.print("True");//Will compare the reference where the strings are stored
        }
        if(C.equals(D)){
            System.out.print(" Equals True");//Will compare the contents of the Strings
        }
    }
}
