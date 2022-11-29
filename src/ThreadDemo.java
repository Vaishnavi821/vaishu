class Display {
    public synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Hello ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(name);
        }
    }
}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

public class MySynchronized {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Ashok");
        MyThread t2 = new MyThread(d, "Vinod");
        t1.start();
        t2.start();
    }
}

