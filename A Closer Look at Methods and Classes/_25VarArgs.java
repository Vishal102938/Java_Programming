// Demonstrates variable length arguments.
class _25VarArgs {
    // vaTest() now uses the vararg.
    static void vaTest(int ...v){
        System.out.print("Number of args: " + v.length + " Contents: ");

        for(int x: v) 
            System.out.print(x + " ");
        System.out.println();

    }
    //Notice, how vaTest() can be called with a 
    // variable length arguments.
    public static void main(String[] args) {
        vaTest(10);       // 1 arg
        vaTest(1, 2, 3);  // 3 args
        vaTest();              // no args
    }
}