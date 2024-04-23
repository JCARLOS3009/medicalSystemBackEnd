package hedgbuild.apiSpring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class controller {

    @GetMapping("/patients")
    public String getAllPatients() {
        return "Retornando todos os pacientes";
    }

    @GetMapping("/patients/{id}")
    public String getPatientById(@PathVariable Long id) {
        return "Retornando paciente com ID: " + id;
    }

    @PostMapping("/patients")
    public String addPatient(@RequestBody String patient) {
        return "Adicionando paciente: " + patient;
    }

    @PutMapping("/patients/{id}")
    public String updatePatient(@PathVariable Long id, @RequestBody String patient) {
        return "Atualizando paciente com ID: " + id + ". Novos dados: " + patient;
    }

    @DeleteMapping("/patients/{id}")
    public String deletePatient(@PathVariable Long id) {
        return "Excluindo paciente com ID: " + id;
    }

    @GetMapping("/doctors")
    public String getAllDoctors() {
        return "Retornando todos os médicos";
    }

    @GetMapping("/appointments")
    public String getAllAppointments() {
        return "Retornando todas as consultas";
    }

    @GetMapping("/appointments/{id}")
    public String getAppointmentById(@PathVariable Long id) {
        return "Retornando consulta com ID: " + id;
    }

    @PostMapping("/appointments")
    public String scheduleAppointment(@RequestBody String appointment) {
        return "Agendando consulta: " + appointment;
    }

    @PutMapping("/appointments/{id}")
    public String updateAppointment(@PathVariable Long id, @RequestBody String appointment) {
        return "Atualizando consulta com ID: " + id + ". Novos dados: " + appointment;
    }

    @DeleteMapping("/appointments/{id}")
    public String cancelAppointment(@PathVariable Long id) {
        return "Cancelando consulta com ID: " + id;
    }
}
