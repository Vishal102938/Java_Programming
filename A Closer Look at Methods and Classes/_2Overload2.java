// Automatic type Promotion apply to Overloading.
class OverloadDemo  {
    void test () {
        System.out.println("No Parameter.");
    }

    // Overload test for two integer Parameter.
    void test( int a , int b) {
        System.out.println("a and b  : " + a + " " + b);
    }

    // Overload test for one double Parameter.
    void  test ( double a) {
        System.out.println("inside test(double) : " + a);
        
    }
}
class _2Overload2 {
    public static void main (String args []) {
        OverloadDemo ob  = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i); // this will invoke the test(double).
        ob.test(123.25); // this will invoke the test (double ).


    }
}