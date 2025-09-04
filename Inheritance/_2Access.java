/* In a class hierarchy private member remain private to their class.
 * This program contains an error and will not compile.
 */

 // Create a superclass.
 class A {
    int i; // public by default.
    private int j; // private to A.

    void setij(int a, int b) {
        i = a;
        j = b;
    }
 }

 // A's j is not accessoble here.
 class B extends A {
    int total;
    void sum() {
        total = i + j; // ERROR, j is not accessible here.
    }
 }

class _2Access {
    public static void main(String[] args) {
        B subOb = new B();
        subOb.setij(10,12);

        subOb.sum();
        System.out.println("Total is " + subOb.total);
        
    }
    
}
