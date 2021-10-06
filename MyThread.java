public class MyThread {
    private static Object monitor = new Object();
    private volatile static char printLetter ='A';
    public static void main(String[] args) {
        MyThread taskThread = new MyThread();
        Thread t1 = new Thread(()->taskThread.printA());
        Thread t2 = new Thread(()->taskThread.printB());
        Thread t3 = new Thread(()->taskThread.printC());
        t1.start();
        t2.start();
        t3.start();

    }
    public static void printA(){
        synchronized (monitor){
            for (int i = 0; i < 5; i++) {
                while (printLetter!='A')
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                System.out.print('A');
                printLetter = 'B';
                monitor.notifyAll();
            }

        }

    }

    public static void printB(){
        synchronized (monitor){
            for (int i = 0; i < 5; i++) {
                while (printLetter!='B')
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                System.out.print('B');
                printLetter = 'C';
                monitor.notifyAll();
            }

        }

    }
    public static void printC(){
        synchronized (monitor){
            for (int i = 0; i < 5; i++) {
                while (printLetter!='C')
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                System.out.print('C');
                printLetter = 'A';
                monitor.notifyAll();
            }

        }

    }
}




