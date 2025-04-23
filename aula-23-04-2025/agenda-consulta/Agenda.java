import java.util.ArrayList;
import java.util.List;

class Agenda {
    List<Consulta> consultas;

    Agenda() {
        this.consultas = new ArrayList<>();
    }

    void addConsulta(Consulta c) {
        for (Consulta consulta : consultas) {
            if (consulta.getData().equals(c.getData())) {
                System.out.println("Consulta não agendada.");
                break;
            } else {
                consultas.add(c);
                System.out.println("Consulta agendada.");
                break;
            }
        }
    }
}
