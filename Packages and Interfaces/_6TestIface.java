interface Callback {
    void callback(int param);
}

class Client implements Callback {
    // Implement Callback's Interface
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implements interfaces " + 
            "may also define other members , too.");
    }
}

class _6TestIface{
    public static void main(String [] args) {
        Callback c = new Client ();
        c.callback(42);
        
    }
}