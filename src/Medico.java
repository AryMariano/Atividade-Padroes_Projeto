class Medico {
    private String nome;
    private String especialidade;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void recomendarTratamento(Paciente paciente, String tratamento) {
        System.out.println("Médico " + nome + " recomenda o tratamento: " + tratamento);
        paciente.receberTratamento(tratamento);
    }
}
