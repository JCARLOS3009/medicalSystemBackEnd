package system;

public class Main {
    public static void main(String[] args) {
        // Criando médico
        Medico medico = new Medico("Dr. João", "Cardiologia");

        // Criando paciente
        Paciente paciente = new Paciente("Maria", 30);

        // Agendando consulta
        String data = "2024-03-30";
        String horario = "10:00";
        medico.agendarConsulta(paciente, data, horario);

        // Realizando pagamento
        FormaDePagamento pagamentoDebito = new PagamentoDebito();
        FormaDePagamento pagamentoCredito = new PagamentoCredito();
        FormaDePagamento pagamentoPIX = new PagamentoPIX();

        pagamentoDebito.pagar(100.0);
        pagamentoCredito.pagar(200.0);
        pagamentoPIX.pagar(150.0);

        // Obtendo informações sobre a consulta agendada
        List<Consulta> consultasAgendadas = medico.getConsultasAgendadas();
        for (Consulta consulta : consultasAgendadas) {
            System.out.println("Consulta agendada para:");
            System.out.println("Paciente: " + consulta.getPaciente().getNome());
            System.out.println("Data: " + consulta.getData());
            System.out.println("Horário: " + consulta.getHorario());
            System.out.println("Médico: " + consulta.getMedico().getNome());
            System.out.println("Especialidade: " + consulta.getMedico().getEspecialidade());
        }
    }
}
