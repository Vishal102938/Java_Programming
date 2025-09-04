// This class defines an integer Stack that can hold 10 values.
class Stack {
    /* Now, both stck and tos are private. This means that 
       they can not be accidentally or maliciously altered in a 
       way that would be harmful to the stack.
    */
    private int stck[] = new int[10];
    private int tos;
    
    //Initialize top-of-stack
    Stack(){
        tos = -1;
    }

    // Push an item onto the stack.
    void push (int item){
        if(tos==9) System.out.println("Stack is full.");
        else stck[++tos] = item;
    }

    // Pop an item from the Stack.
    int pop() {
        if(tos<0) {
            System.out.println("Stack is underflow.");
            return 0;
        }
        else return stck[tos--];
    }
}
class _12TestStack {
    public static void main(String args[]) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // push some numbers onto the stack 
        for(int i=0; i<10; i++) mystack1.push(i);
        for(int i=10; i<20; i++) mystack2.push(i);

        //pop those numbers off the Stack
        System.out.println("Stack in mystack1: ");
        for(int i=0; i<10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2:");
        for(int i=0; i<10; i++)
            System.out.println(mystack2.pop());
        
        //These statements are not legal.
        // mystack1.stck[3] = 100;
        // mystack2.tos = -2;

    }
    
}
