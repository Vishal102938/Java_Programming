// A nested Interface Example.

// This contains a member interface.
class A {
    // This is a nested Interface.
    public interface NestedIF {
        public boolean isNotNegative(int x);
    }
}

// B implements the nested Interface.
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x<0 ? false : true;
    }
}
public class _9NestedIFDemo {
    public static void main(String[] args) {
        // Use a nested interface reference
        A.NestedIF nif = new B();
        if(nif.isNotNegative(10))
            System.out.println("10 is not a negative number");
        if(nif.isNotNegative(-12))
            System.out.println("This won't be displayed");
    }
}
