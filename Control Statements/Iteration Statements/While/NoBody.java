// The target of loop can be empty.

public class NoBody {
    
        public static void main(String[] args) {
        int i =100;
        int j = 200;

    while(++i<--j);
    System.out.println("Midpoint is " + i + ".");

    }
    
}
//@SuppressWarnings("empty-statement") is used to to run this program . this code is correct but it will not run vs code, it will run on online compiler .

