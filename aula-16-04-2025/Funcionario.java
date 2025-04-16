import java.util.Calendar;

public class Funcionario extends Pessoa {
    Calendar dataAdmissao;
    String matricula;

    public Funcionario(String nome, String sexo, Calendar dataAdmissao, String matricula) {
        super(nome, sexo);
        this.dataAdmissao = dataAdmissao;
        this.matricula = matricula;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public String getMatricula() {
        return matricula;
    }

    
}
