package main.java.lambda;

public class LambdaExpress {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 3; i++){
//                    System.out.println("Hello world for thread [" + Thread.currentThread().getName() + "]");
//                }
//            }
//        };

        //Lambda Expression (Java 8)
        Runnable runnable = () -> {
            for (int i = 0; i < 3; i++){
                    System.out.println("Hello world for thread [" + Thread.currentThread().getName() + "]");
               }
        };

        try{
            Thread t = new Thread(runnable);
            t.start();
            t.join();
        }catch(InterruptedException ex){
            throw new RuntimeException(ex);
        }
    }

}
