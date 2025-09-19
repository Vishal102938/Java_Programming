// try statements are implicitly nested via calls to method.

class _8MethNestTry {
    static void nesttry(int a) {
        try { // nested try block
            /* If one command-line is used,
               then a devide-by-zero exception will result by 
               the following code.
             */ 
            if(a == 1) a = a/(a-a); // Devide-by-zero

            /* If two command-line is used, then generate an out-of-bounds exception*/

            if(a == 2) {
                int c[] = {1};
                c[42] = 99; // generate an out-bounds exception.
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out-of-bounds: " + e);
        }
    }
    public static void main(String args[] ) {
        try {
            int a  = args.length;

            /* If no command-line args are present 
            *  the following statements will generate an 
            * devide-by-zero exception.
            */
            int b = 42 / a;
            System.out.println("a: " + a);
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("Devide by zero: " + e);
        }       
    }
}