package Multithrading;

class MyThread extends Thread {
    public MyThread(String name) {

        super(name);

    }

    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("Thank you - " + this.getName());
            i++;
        }
    }
}

public class Thread_priorities {
    public static void main(String[] args) {
        // Ready Queue : t1 ,t2 , t3 ,t4; t5

        MyThread t1 = new MyThread("Ritik");
        MyThread t2 = new MyThread("Aman");
        MyThread t3 = new MyThread("Sachin");
        MyThread t4 = new MyThread("Vinit");
        MyThread t5 = new MyThread("Ramu kaka (Most Importent)");
        t5.getPriority();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
