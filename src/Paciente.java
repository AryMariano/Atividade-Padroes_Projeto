import java.util.ArrayList;
import java.util.List;

class Paciente {
    private String nome;
    private List<Observador> observadores = new ArrayList<>();
    private List<String> tratamentosRecomendados = new ArrayList<>();

    public Paciente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void alterarStatus(String novoStatus) {
        System.out.println("Status do paciente " + nome + " alterado para: " + novoStatus);
        notificarObservadores("Status atualizado: " + novoStatus);
    }

    private void notificarObservadores(String mensagem) {
        for (Observador observador : observadores) {
            observador.atualizar(mensagem);
        }
    }

    public void receberTratamento(String tratamento) {
        tratamentosRecomendados.add(tratamento);
        System.out.println("Paciente " + nome + " recebeu nova recomendação de tratamento: " + tratamento);
    }
}
