
public class App {
public static void main(String[] args) {
    SistemaDeAtendimento sistema = new SistemaDeAtendimento();
    
    for (int i = 1; i <= 10; i++) {
        sistema.adicionarCliente(new Cliente(i));
    }

    sistema.iniciarAtendimento();
}
}
