class Aluno {
    String nome;
    Curso[] cursos;
    int n;

    Aluno(String nome, int max) {
        this.nome = nome;
        this.cursos = new Curso[max];
        this.n = 0;
    }

    void adcCurso(Curso c) {
        if (n < cursos.length) {
            cursos[n++] = c;
        } else {
            System.out.print("O aluno não pode mais se inscrever em outros cursos");
        }
    }

    void listarCursos() {
        for (Curso c : cursos) {
            if (c != null) {
                System.out.println(c.nome);
            }
        }
    }
}