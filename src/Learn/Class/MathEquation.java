package Learn.Class;

public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    double result;

    void execute() {
        //Here in the execute method we are not passing any arguments because becuase it can directly access all the
        // elements which are defined inside the class
        switch (opCode) {
            case 'a':
                result = leftVal+rightVal;
                break;
            case 's':
                result = leftVal-rightVal;
                break;
            case 'm':
                result = leftVal*rightVal;
                break;
            case 'd':
                result = rightVal != 0?leftVal/rightVal:0.0d;
                String finalstat = (result == 0.0d?"not divisble":"divisible");
                System.out.println("The values are "+finalstat);
                /*
                 * An example of conditional assignment instead of nesting if inside case statement
                 */
                break;
            default:
                System.out.println("Invalid Opcode "+opCode);
                result = 0.0d;
                break;
        }
    }

}
