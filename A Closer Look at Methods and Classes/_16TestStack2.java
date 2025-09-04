 // Improved Stack class that uses length array member.
class Stack{ 
    private int [] stck;
    private int tos;

    // allocate and initialize tos.
    Stack(int size){
        stck = new int[size];
        tos = -1;
    }

    // push an item onto the stack.
    void push (int item) {
        if(tos==stck.length-1)
           System.out.println("Stack is full");
        else 
            stck[++tos] = item;
    }

    //pop an item off the stack.
    int pop() {
        if(tos<0) {
            System.out.println("Stack is full.");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }    
}

class _16TestStack2 {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        //push some numbers onto the stack.
        for(int i=0; i<5; i++) mystack1.push(i);
        for(int i=0; i<8; i++) mystack2.push(i);

        //pop those numbers off the stack.
        System.out.println("Stack in mystack1: ");
        for(int i=0; i<5; i++)
            System.out.println(mystack1.pop());
        
        System.out.println("Stack in mystack2: ");
        for(int i=0; i<8; i++)
            System.out.println(mystack2.pop());
    }
}
