package multithreadingDemo;

public class ThreadDemo extends Thread{
    /*
    * 通过继承Thread来创建线程
     * */

    private String threadName;
    private Thread t;

    public ThreadDemo(String name){
        threadName = name;
        System.out.println("constructor threadname: " + threadName);
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
        ThreadDemo t1 = new ThreadDemo("Thread-1");

        //设置为守护线程
        t1.setDaemon(true);
        //设置线程名称
        t1.setName("hello");
        //设置优先级
        t1.setPriority(Thread.MIN_PRIORITY);
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t1.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        try {
            t1.join();
        }catch(InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        ThreadDemo t2 = new ThreadDemo("Thread-2");
        t2.start();
    }

}
