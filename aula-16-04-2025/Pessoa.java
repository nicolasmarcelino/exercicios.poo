public class Pessoa implements Apresentavel {
    String nome;
    String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
        System.out.print("Pessoa do tipo ");
    }

    @Override
    public void apresentar() {
        System.out.println("\nINFORMAÇÕES DA PESSOA");
        System.out.println("Nome: "+getNome());
        System.out.println("Sexo: "+getSexo());
    }

    public String getNome() {
        return nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
