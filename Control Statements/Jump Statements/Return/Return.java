// Demonstrate return.

class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before the return.");
        
        if(t) return;  // return to caller and here if is required to trick the compiler because code is written after return.
         // without if it will throw an error of unreachable code.
        System.out.println("This won't execute");
        
    }
}