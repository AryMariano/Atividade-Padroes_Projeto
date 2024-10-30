public class Main {
    public static void main(String[] args) {
        SistemaHospital sistema = new SistemaHospital();

        Paciente paciente1 = new Paciente("João Silva");
        sistema.registrarNovoPaciente(paciente1);

        Medico medico1 = new Medico("Dr. Carlos", "Cardiologia");
        sistema.registrarNovoMedico(medico1);

        FichaPaciente ficha = new FichaPaciente.Builder(paciente1)
                .idade(45)
                .historicoMedico("Hipertensão")
                .build();
        System.out.println(ficha);

        Enfermeiro enfermeiro1 = new Enfermeiro("Ana");
        paciente1.adicionarObservador(enfermeiro1);

        medico1.recomendarTratamento(paciente1, "Reduzir ingestão de sal e iniciar beta-bloqueador");

        paciente1.alterarStatus("Em observação após recomendação médica");
    }
}
