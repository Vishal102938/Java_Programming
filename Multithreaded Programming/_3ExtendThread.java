// create a second thread by extending Thread
class NewThread extends Thread {
    NewThread() {
        // create a new second thread.
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
        start(); // start the thread.
    }

    // This is the entry point for some thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted.");
        }
        System.out.println("Exiting Child Thread.");
    }
}
 class _3ExtendThread {
    public static void main(String[] args) {
        new NewThread(); // create a new thread. 

        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
        }
        System.out.println("Main Thread Exinting");
    }
}
