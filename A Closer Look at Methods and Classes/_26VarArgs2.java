// Use varargs with standard arguments.
class _26VarArgs2 {
    // Here, msg is a normal Parameter but v is 
    // varargs parameter.
    static void vaTest(String msg, int ...v){
        System.out.print(msg + v.length + " Contents: " );

        for(int x: v)
            System.out.print(x + " ");
        System.out.println();

    }
    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }
}
// Correct : int doIt(int a, int b, double c, int ...v){
// Incorrect : int doIt(int a, int b , double c, int ...v, boolean morevals)
// Incorrect: int doIt(int a, int b, double c, int ...v,   boolean ...morevals)