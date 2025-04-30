public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();


        Consulta c1 = new Consulta(0, 0);
        Consulta c2 = new Consulta(2, 3);
        Exame e1 = new Exame(12, 4);


        agenda.marcarHorario(c1);
        agenda.marcarHorario(c2);
        agenda.marcarHorario(e1);

        agenda.mostrar();
    }
}