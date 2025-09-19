// Creating multiple threads.
class NewThread implements Runnable {
    String name; // name of thread.
    Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        t.start(); // start the thread.
    }

    // This is the entry point for the run.
    public void run(){
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted.");
        }
        System.out.println(name + " Exiting.");
    }
}

class _4MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("One"); // start thread.
        new NewThread("Two");
        new NewThread("Three");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
        }
        System.out.println("Main Thread Exiting.");
    }
}