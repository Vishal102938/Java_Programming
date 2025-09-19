// An implemetation of IntStack that uses the fixed storage.
class _10FixedStack implements _10IntStack {
    private int stck[];
    private int tos;
    
    // allocate and initialize the stack.
    _10FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // push an item onto the stack 
    public void push(int item) {
        if(tos == stck.length-1)
            System.out.println("Stack is full.");
        else 
            stck[++tos] = item;
    }

    // Pop an item from the stack.
    public int pop() {
        if(tos<0) {
            System.out.println("Stack is underflow");
            return 0;
        } else {
            return stck[tos--];
        }
    }  
}
