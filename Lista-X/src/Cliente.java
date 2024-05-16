import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private int id;

    public Cliente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public void entrarNaFila() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + " : Cliente " + id + " entrou na fila de espera...");
    }

    public void sendoAtendido() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + " : Atendendo o cliente " + id + "...");
    }

    public void atendido(int funcionarioId, int tempo) {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + " : Cliente " + id + " atendido pelo funcionário " + funcionarioId + " : com o tempo de " + tempo + " segundos");
    }
}
