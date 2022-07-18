package work;

public class threaddemo {
    public static void main(String[] args) {
        Runnable thread1 = () -> {
            // this is body of thread
            for (int i = 0; i <= 10; i++) {
                System.out.println("Value of i is : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(thread1);
        t.setName("Ravi");
        t.start();
    }
}
