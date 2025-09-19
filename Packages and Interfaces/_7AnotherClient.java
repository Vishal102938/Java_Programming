// Another Implementation of callback.
class _7AnotherClient implements _5Callback {
    // Implement callback interface
    public void callback(int p) {
        System.out.println("Another version of callback.");
        System.out.println("p squared is " + (p*p));
    }
}