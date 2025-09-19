// Demonstrate thread priority
class clicker implements Runnable {
    long click = 0;
    Thread t;
    private volatile boolean running = true;

    public clicker (int p) {
        t = new Thread(this);
        t.setPriority(p);
    }

    public void run() {
        while(running) {
            click++;
        }
    }

    public void stop() {
        running = false;
    }

    public void start() {
        t.start();
    }
}

class _6HiLoPri {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        clicker hi = new clicker (Thread.NORM_PRIORITY + 2);
        clicker lo = new clicker (Thread.NORM_PRIORITY - 2);

        lo.start();
        hi.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }

        lo.stop();
        hi.stop();

        // wait for child thread to terminate.
        try {
            hi.t. join();
            lo.t.join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught.");
        }

        System.out.println("Low-priority thread: " + lo.click);
        System.out.println("Hi-priority thread: " + hi.click);
    }
}
