/* This program demonstrate the difference betwee 
public and private 
 */
 class Test {
    int a; // default access
    public int b; // public access
    private int c; // private access

    // Method to access c
    void setc (int i) { // set c's value
        c = i;
    }

    int getc () { // get c's value
        return c;
    }


 }

 class _11AccessTest {
    public static void main(String args[]) {
        Test ob = new Test();

        // These are OK, a and b may be accessed directly.
        ob.a = 10;
        ob.b = 20;

        //These are not OK, will cause an error.

        // ob.c =100;

        //You may access c through it methods
        ob.setc(100);
        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
 }