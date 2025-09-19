// create an iterface variable and access the 
// stack through it.

class _12IFTest3 {
    public static void main(String[] args) {
        _10IntStack mystack; // create an interface reference variable.
        _11DynStack ds = new _11DynStack(5);
        _10FixedStack fs = new _10FixedStack(8);

        // push some numbers onto the stack.
        mystack = ds; // load the dynamic stack;
        for(int i=0; i<12; i++) mystack.push(i);

        mystack = fs; // load the fixed stack.
        for(int i =0; i<8; i++) mystack.push(i);

        // pop those numbers off the stack
        mystack = ds;
        System.out.println("Values in dynamic stack: ");
        for(int i = 0; i<12; i++)
            System.out.println(mystack.pop());
        System.out.println();

        mystack = fs;
        System.out.println("Values in fixed stack: ");
        for(int i = 0; i<8; i++) System.out.println(mystack.pop());
    }    
}
