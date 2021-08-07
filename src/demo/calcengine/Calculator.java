package demo.calcengine;

public class Calculator {

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

}
