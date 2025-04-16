import java.util.Calendar;

public class Main {
    public static void mostrar(Apresentavel objeto) {
        objeto.apresentar();
    }

    public static void main(String[] args) {
        // Definindo datas
        Calendar dataInternacao = Calendar.getInstance();
        dataInternacao.set(Calendar.YEAR, 2025);
        dataInternacao.set(Calendar.MONTH, Calendar.APRIL);
        dataInternacao.set(Calendar.DAY_OF_MONTH, 21);

        Calendar dataAdmissao = Calendar.getInstance();
        dataAdmissao.set(Calendar.YEAR, 2015);
        dataAdmissao.set(Calendar.MONTH, Calendar.MAY);
        dataAdmissao.set(Calendar.DAY_OF_MONTH, 4);

        // Definindo objetos
        // Paciente paciente = new Paciente("Alberto Severino", "Masculino", dataInternacao);
        Medico medico = new Medico("Josefina Lindsay", "Feminino", dataAdmissao, "32857923", "29352935680");
        
        mostrar(medico);
    }
}