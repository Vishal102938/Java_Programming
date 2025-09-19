//Demonnstrate exception chaining.
class _14ChainExcDemo {
    static void demoproc() {
        // Create an exception
        NullPointerException e = new NullPointerException("top layer");

        // add a cause
        e.initCause(new ArithmeticException("cause"));

        throw e;
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            // display top layer exception
            System.out.println("Caught: " + e);

            // display the cause exception.
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
