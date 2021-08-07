package demo.calcengine;

public class ClaculatorUsingArrays {

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