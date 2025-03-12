public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.adicionarNota(10);
        aluno.adicionarNota(5);
        aluno.adicionarNota(7);

        aluno.setNome("Ronna R. Madison");
        aluno.setMatricula(3971406);

        aluno.exibirInformacoes();
    }
}