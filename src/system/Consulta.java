package system;

public class Consulta {
	private Paciente paciente;
    private Medico medico;
    private String data;
    private String horario;

    public Consulta(Paciente paciente, Medico medico, String data, String horario) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.horario = horario;
    }
    // Getters e setters para os atributos podem ser adicionados conforme necessário
}
