import java.util.Calendar;

public class Paciente extends Pessoa {
    Calendar dataInternacao;

    public Paciente(String nome, String sexo, Calendar dataInternacao) {
        super(nome, sexo);
        this.dataInternacao = dataInternacao;
        System.out.println("paciente criado!");
    }

    public void setDataInternacao(Calendar dataInternacao) {
        this.dataInternacao = dataInternacao;
    }

    public Calendar getDataInternacao() {
        return dataInternacao;
    }
}
