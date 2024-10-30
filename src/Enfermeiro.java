class Enfermeiro implements Observador {
    private String nome;

    public Enfermeiro(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Enfermeiro " + nome + " recebeu alerta: " + mensagem);
    }
}
