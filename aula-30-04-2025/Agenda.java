public class Agenda implements Agendavel {
    Acao[][] semana = new Acao[13][5]; // 13 horários, 5 dias

    public Agenda() {
        System.out.println("Agenda criada!");
    }

    public void marcarHorario(Acao a) {
        this.semana[a.getHora()][a.getData()] = a;
        System.out.println(a.getNome()+" agendada!");
    }

    public void mostrar() {
        Acao[][] a = this.semana;
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
        String[] horarios = {"8h", "9h", "10h", "11h", "12h", "13h", "14h", "15h", "16h", "17h", "18h", "19h", "20h"};


        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] != null) {
                    System.out.println(a[i][j].getNome()+" marcada para às "+horarios[i]+" de "+dias[j]);
                }
            }
        }
    }
}