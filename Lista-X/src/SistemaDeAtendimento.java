import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SistemaDeAtendimento {
    private Queue<Cliente> fila;
    private Funcionario[] funcionarios;
    private ExecutorService executor;

    public SistemaDeAtendimento() {
        fila = new LinkedList<>();
        funcionarios = new Funcionario[9];
        for (int i = 0; i < 9; i++) {
            funcionarios[i] = new Funcionario(i + 1);
        }
        executor = Executors.newFixedThreadPool(9);
    }

    public void adicionarCliente(Cliente cliente) {
        fila.add(cliente);
        cliente.entrarNaFila();
    }

    public void iniciarAtendimento() {
        while (!fila.isEmpty()) {
            Cliente cliente = fila.poll();
            if (cliente != null) {
                executor.execute(new AtendimentoTask(cliente));
            }
        }
        executor.shutdown();
    }
}