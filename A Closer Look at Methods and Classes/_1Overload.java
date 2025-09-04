// Demonstrate the method overload.
class OverloadDemo {
    void test () {
        System.out.println("No Parameters.");
    }

    // Overload for One integer Parameter.
    void test (int a) {
        System.out.println("a :" + a);
    }

    // Overload for two Integer Parameter.
    void test(int a , int b ) {
        System.out.println("a and b: " + a + " " + b);
    }

    // Overload for one double Parameter.
    double test (double  a) {
        System.out.println("double a : " + a);
        return a*a;
    }
}
class _1Overload{
    public static void main(String[] args) {
        OverloadDemo ob  = new OverloadDemo();
        double result;

        // Call all versions of test().
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25) is: " + result);

    

        
    }
}