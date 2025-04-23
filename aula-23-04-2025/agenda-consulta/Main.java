import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Consulta c1 = new Consulta(LocalDateTime.of(2025,04,23,20,30));
        Consulta c2 = new Consulta(LocalDateTime.of(2025,04,23,20,30));
        Consulta c3 = new Consulta(LocalDateTime.of(2025,04,29,9,0));

        System.out.println(c1.getData());
        System.out.println(c2.getData());
        System.out.println(c3.getData());
    }    
}
