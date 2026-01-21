package core.java.multithreading;

public class MultipleThreadDemo extends Thread {

    public void run() {
        try {
            System.out.println("Thread running: "+Thread.currentThread().getName());
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }
    public static void main ( String[] args ) throws InterruptedException {
        MultipleThreadDemo m1 = new MultipleThreadDemo();
        MultipleThreadDemo m2 = new MultipleThreadDemo();
        MultipleThreadDemo m3 = new MultipleThreadDemo();

        m1.start();
        m1.join ();
        m2.start();
        m2.join ();
        m3.start();
    }
}
