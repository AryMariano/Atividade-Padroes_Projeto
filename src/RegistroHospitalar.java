class RegistroHospitalar {
    private static RegistroHospitalar instancia;

    private RegistroHospitalar() {}

    public static RegistroHospitalar getInstancia() {
        if (instancia == null) {
            instancia = new RegistroHospitalar();
        }
        return instancia;
    }

    public void registrarPaciente(Paciente paciente) {
        System.out.println("Paciente " + paciente.getNome() + " registrado.");
    }

    public void registrarMedico(Medico medico) {
        System.out.println("Médico " + medico.getNome() + " registrado.");
    }
}
