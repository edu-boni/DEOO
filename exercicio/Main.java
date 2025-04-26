import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5); 

        Produtor produtor = new Produtor(buffer, 1500);
        Consumidor consumidor = new Consumidor(buffer, 750);

        ExecutorService executorThreads = Executors.newCachedThreadPool();

        executorThreads.execute(produtor);
        executorThreads.execute(consumidor);

        executorThreads.shutdown();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("Fim do main.");
    }
}
