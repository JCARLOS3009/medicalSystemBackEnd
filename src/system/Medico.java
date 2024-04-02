package system;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nome;
    private String especialidade;
    private List<Consulta> consultasAgendadas;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.consultasAgendadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public List<Consulta> getConsultasAgendadas() {
        return consultasAgendadas;
    }

    public void agendarConsulta(Paciente paciente, String data, String horario) {
        Consulta consulta = new Consulta(paciente, this, data, horario);
        consultasAgendadas.add(consulta);
    }

    // Outros métodos relevantes para a classe Medico podem ser adicionados aqui
}

