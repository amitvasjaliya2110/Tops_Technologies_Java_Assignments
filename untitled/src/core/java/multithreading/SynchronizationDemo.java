package core.java.multithreading;

class Counter{

    synchronized void count(){
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class SynchronizationDemo extends Thread {

    Counter c;

    SynchronizationDemo(Counter c){
        this.c = c;
    }

    public void run(){
        c.count();
    }
    public static void main ( String[] args ) {
        Counter c1 = new Counter();

        SynchronizationDemo s1 = new SynchronizationDemo(c1);
        SynchronizationDemo s2 = new SynchronizationDemo(c1);

        s1.start();
        s2.start();
    }
}
