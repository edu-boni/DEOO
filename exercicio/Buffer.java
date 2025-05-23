
import java.util.ArrayList;
import java.util.List;

public class Buffer {

    private final List<Integer> buffer;
    private final int capacidade;

    public Buffer(int capacidade) {
        this.capacidade = capacidade;
        this.buffer = new ArrayList<>();
    }

    public synchronized void set(int valor) throws Exception {
        while (buffer.size() == capacidade) {
            System.out.println("Tentou escrever, mas o buffer está cheio.");
            wait();
        }

        buffer.add(valor);
        System.out.println("Produziu: " + valor + " | Buffer atual: " + buffer);
        notifyAll();
    }

    public synchronized int get() throws Exception {
        while (buffer.isEmpty()) {
            System.out.println("Tentou ler, mas o buffer está vazio.");
            wait();
        }

        int valor = buffer.remove(0);
        System.out.println("Consumiu: " + valor + " | Buffer atual: " + buffer);
        notifyAll();
        return valor;
    }
}
