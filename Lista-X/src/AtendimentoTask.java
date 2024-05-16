import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AtendimentoTask implements Runnable {
    private Cliente cliente;

    public AtendimentoTask(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void run() {
        try {
            cliente.sendoAtendido();
            Random random = new Random();
            int tempoAtendimento = random.nextInt(5) + 1; // Tempo aleatório entre 1 e 5 segundos
            TimeUnit.SECONDS.sleep(tempoAtendimento);
            int funcionarioId = random.nextInt(9) + 1; // Seleciona um funcionário aleatório
            cliente.atendido(funcionarioId, tempoAtendimento);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}