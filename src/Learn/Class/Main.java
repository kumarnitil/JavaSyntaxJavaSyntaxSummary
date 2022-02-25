package Learn.Class;

public class Main {

    public static void main(String[] args) {
        performCalculations();
        /*
        Understanding Classes and reference types
        Whenever an object is created it creates a reference in the memory which will store the contents which has been defined in the class
        flight2 = flight1 when we do this like make one object equals other then flight2 will also start pointing to the same
        memory location which flight1 was pointing.
        */

        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        flight2.add1passenger();
        System.out.println(flight2.passengers);
        flight2 = flight1;
        System.out.println(flight2.passengers);
        flight1.add1passenger();
        flight1.add1passenger();
        System.out.println(flight2.passengers);
    }
    static void performCalculations() {
        MathEquation[] equations = new MathEquation[4];
        /*
        When we make the declaration
        MathEquation[] equations = new MathEquation[4];
        Here we are creating an Array of MathEquation references.
        thus we are not declaring four instances of the MathEquation Class
        instead I will create four reference of the types MathEquation
        Each of this element inside this array will specifically need to create an instance of the Math equation class
        Thus originally the following declaration will follow
        post - MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation();
        equations[0].leftVal = 100.0d;
        equations[0].rightVal = 50.0d;
        equations[0].opCode = 'd';
         */
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');

        for(MathEquation equation : equations){
            equation.execute();
            System.out.println("results = "+ equation.result);
        }


    }

    private static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;
        return equation;
    }


}
