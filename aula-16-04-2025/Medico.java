
import java.util.Calendar;

public class Medico extends Funcionario {
    String crm;
    
    public Medico(String nome, String sexo, Calendar dataAdmissao, String matricula, String crm) {
        super(nome, sexo, dataAdmissao, matricula);
        this.crm = crm;
        System.out.print("médico criado!");
    }

    public void setCRM(String crm) {
        this.crm = crm;
    }

    public String getCRM() {
        return crm;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Data de admissão: "+getDataAdmissao().getTime());
        System.out.println("Matrícula: "+getMatricula());
        System.out.println("CRM: "+getCRM());
    }

}