package multithreadingDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThread implements Callable<Integer> {
    //Callable  当start后调用call

    public static void main(String[] args) {
        CallableThread ct = new CallableThread();
        FutureTask<Integer> ft = new FutureTask<Integer>(ct);

        for (int i = 0; i < 30; i++) {
            System.out.println("dd: " + i);
            if ( i == 20 ){
                System.out.println("i==20,创建线程去执行call method，自己接着打印number");
                new Thread(ft,"有返回值的线程").start();
            }
        }
        try {
            System.out.println("子线程的返回值： " + ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Integer call(){
        int i = 0;
        for (; i < 30; i++) {
            System.out.println("current thread: " + Thread.currentThread().getName() + i);
        }
        return i;
    }

}
