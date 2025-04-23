class Main {
    public static void main(String[] args) {
        Curso poo = new Curso("POO");
        Curso arq = new Curso("Arquitetura de computadores");
        Curso alg = new Curso("Álgebra linear");

        Aluno aluno = new Aluno("Nicolas Marcelino", 5);

        aluno.adcCurso(poo);
        aluno.adcCurso(arq);
        aluno.adcCurso(alg);

        aluno.listarCursos();
    }
}