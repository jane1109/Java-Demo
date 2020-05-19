package com.example.as.ExeService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;


/**
 * @author jiayingchen
 * @created 2020/05/04
 * @project course-april-2020
 */

public class Executor_Service {
    class A {
        public String getMethod() {
            return "A.getMethod";
        }
    }

    class B {
        public String getMethod() {
            return "B.getMethod";
        }
    }

    public void runSameTime() {
        //Internally manages thread pool of 2 threads
        ExecutorService service = Executors.newFixedThreadPool(2);

        try {
            // submits a task to an ExecutorService and returns a result of type Future
            Future<String> aFuture = service.submit(() -> new Executor_Service.A().getMethod());
            Future<String> bFuture = service.submit(() -> new Executor_Service.B().getMethod());
            boolean allDone = false;
            while (!allDone) {
                if (aFuture.isDone() && bFuture.isDone()) {
                    //return the object result
                    System.out.println(bFuture.get() + " " + aFuture.get());
                    allDone = true;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            //stop accepting new tasks and shut down after all running threads finish their current work.
            service.shutdown();
        }
    }

    public static void main(String[] main){
        Executor_Service es = new Executor_Service();
        es.runSameTime();
    }
}
