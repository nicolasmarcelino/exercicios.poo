
import java.util.Calendar;

public class Gerente extends Funcionario {
    String cra;

    public Gerente(String nome, String sexo, Calendar dataAdmissao, String matricula, String cra) {
        super(nome, sexo, dataAdmissao, matricula);
        this.cra = cra;
    }

    public String getCra() {
        return cra;
    }

    public void setCra(String cra) {
        this.cra = cra;
    }

}
