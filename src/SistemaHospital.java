class SistemaHospital {
    private RegistroHospitalar registro;

    public SistemaHospital() {
        this.registro = RegistroHospitalar.getInstancia();
    }

    public void registrarNovoPaciente(Paciente paciente) {
        registro.registrarPaciente(paciente);
        System.out.println("Ficha de paciente criada para " + paciente.getNome());
    }

    public void registrarNovoMedico(Medico medico) {
        registro.registrarMedico(medico);
        System.out.println("Médico registrado: " + medico.getNome());
    }
}
