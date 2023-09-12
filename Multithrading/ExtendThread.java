package Multithrading;

class MyThread1 extends Thread {
    public void run() {
        int i  = 0;
        while (i<10) {

            System.out.println("My Cooking thread is Runing");
            System.out.println("I am Happy");
            i++;
        }
    }
}

class MyThread2 extends Thread {

    public void run() {
        int i = 0;
        while (i<10) {
            System.out.println("Thread2 chatting With Her");
            System.out.println("I am Sad");
            i++;
        }
    }
}

public class ExtendThread {
    public static void main(String[] args) {
          MyThread1 T1 = new MyThread1();
          MyThread2 T2 = new MyThread2();
          T1.start();
          T2.start();
    }
}
