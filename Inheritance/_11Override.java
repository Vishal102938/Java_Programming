// Method with different type signature are overloaded not overridden.

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

// create a subclass by extending class A.
class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // overload shoe().
    void show(String msg) {
        System.out.println(msg + k);
    }
}
class _11Override {
    public static void main(String [] args) {
        B subOb = new B(1,2,3);

        subOb.show("This is k: "); // This calls show() in B
        subOb.show(); // this calls show() in A.
    }
    
}
