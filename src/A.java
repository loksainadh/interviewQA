import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class A {


    public static void main(String[] args)  throws  Exception {

        System.out.println(Thread.currentThread().getName());


        ExecutorService abc = Executors.newFixedThreadPool(2);
        abc.submit(()->{
            System.out.println(Thread.currentThread().getName());

            System.out.println("task1 strated");
            try {
                System.out.println("Task one in progress");
                Thread.sleep(5000);
                System.out.println("completed task one");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        abc.submit(()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("task2 strated");
            try {
                System.out.println("Task one in progress");
                Thread.sleep(1000);
                System.out.println("completed task 2");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });


    }

}
