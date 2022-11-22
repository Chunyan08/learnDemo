package multithreadingDemo;

public class RunnableDemo implements Runnable {
    //通过接口来实现
    /* Thread Lifecycle
    * new
    * start
    * run
    * sleep join suspend
    * run
    * dead
    * 线程同步
    * 线程间通信
    * 线程死锁
    * 线程控制：挂起、停止和恢复
    * */
    private String threadName;
    private Thread t;
    public RunnableDemo(String name){
        threadName = name;
        System.out.println("threadname: " + threadName);
    }

    public void run(){
        System.out.println("threadname: " + threadName);
        //sleep
        for (int i = 4; i > 0; i--) {
            System.out.println("threadname: " + threadName + "-" + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("threadname: " + threadName + "was interrupted");
            }
        }
        System.out.println(threadName + " exit");
    }

    public void start(){
        //
        System.out.println("threadname: " + threadName + " is running");
        if( t == null) {
            Thread t = new Thread(this,threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Thread-1");
        r1.start();
        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r2.start();
    }

}
