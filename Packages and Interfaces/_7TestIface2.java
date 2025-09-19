public class _7TestIface2 {
    public static void main(String[] args) {
        _5Callback c = new _5Client();
        _7AnotherClient ob = new _7AnotherClient();
        
        c.callback(42);

        c = ob; // c now refers to the AnotherClient object.

        c.callback(42);
    }
}