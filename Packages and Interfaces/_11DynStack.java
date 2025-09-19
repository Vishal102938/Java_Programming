// Implement a "growable" Stack.
class _11DynStack implements _10IntStack {
    private int stck[];
    private int tos;

    // allocate and initialize stack.
    _11DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Push an item onto the stack.
    public void push(int item) {
        // If stack is full, allocate a larger stack.
        if(tos == stck.length -1){
            int temp[] = new int[stck.length * 2];
            for(int i = 0; i < stck.length; i++)
                temp [i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else {
            stck [++tos] = item;
        }
    }
    
    // Pop those item off the Stack.
    public int pop () {
        if(tos<0) {
            System.out.println("Stack is underflow");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
