package core.java.multithreading;

class InterThreadCommunicationDemo{

    int value;
    boolean available = false;

    synchronized void produce(int val) {
        if (available) {
            try {
                wait();
            } catch (Exception e) {}
        }
        value = val;
        System.out.println("Produced: " + value);
        available = true;
        notify();
    }

    synchronized void consume() {
        if (!available) {
            try {
                wait();
            } catch (Exception e) {}
        }
        System.out.println("Consumed: " + value);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    InterThreadCommunicationDemo sr;

    Producer(InterThreadCommunicationDemo sr) {
        this.sr = sr;
    }

    public void run() {
        sr.produce(500);
    }
}

class Consumer extends Thread {
    InterThreadCommunicationDemo sr;

    Consumer(InterThreadCommunicationDemo sr) {
        this.sr = sr;
    }

    public void run() {
        sr.consume();
    }

    public static void main(String[] args) {
        InterThreadCommunicationDemo sr = new InterThreadCommunicationDemo();

        Producer p = new Producer(sr);
        Consumer c = new Consumer(sr);

        p.start();
        c.start();
    }
}
