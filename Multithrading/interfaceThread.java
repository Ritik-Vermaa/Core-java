package Multithrading;


class MyThreadRunnable  implements Runnable{
    public void run(){
        System.out.println("I am A Man");
    }
}
class MyThreadRunnable2  implements Runnable{
    public void run(){
        System.out.println("I am a Woman");
    }
}
public class interfaceThread {
    public static void main(String[] args) {
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun.start(); // Direct Start mathod lo implement nahi kar sakrte
        gun2.start();
    }
}
