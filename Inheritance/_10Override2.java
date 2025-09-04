// Using super to for superclass method.

//create a superclass
class A {
    int i, j;
    A(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j.
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

//create a subclass by extending A.
class B extends A {
    int k;

    B(int a, int b, int c){
        super(a, b);
        k = c;
    }

    //display k
    void show() {
        super.show(); // this calls the A's show().
        System.out.println("k: " + k);
    }
}
class _10Override2 {
    public static void main(String [] args) {
        B subOb = new B(1, 2, 3);

        subOb.show();
    }
    
}
