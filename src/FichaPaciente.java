class FichaPaciente {
    private Paciente paciente;
    private int idade;
    private String historicoMedico;

    private FichaPaciente(Builder builder) {
        this.paciente = builder.paciente;
        this.idade = builder.idade;
        this.historicoMedico = builder.historicoMedico;
    }

    public static class Builder {
        private Paciente paciente;
        private int idade;
        private String historicoMedico;

        public Builder(Paciente paciente) {
            this.paciente = paciente;
        }

        public Builder idade(int idade) {
            this.idade = idade;
            return this;
        }

        public Builder historicoMedico(String historicoMedico) {
            this.historicoMedico = historicoMedico;
            return this;
        }

        public FichaPaciente build() {
            return new FichaPaciente(this);
        }
    }

    @Override
    public String toString() {
        return "FichaPaciente{" + "paciente=" + paciente.getNome() + ", idade=" + idade + ", historicoMedico='" + historicoMedico + '\'' + '}';
    }
}
