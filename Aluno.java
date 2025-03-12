import java.util.Scanner;

public class Aluno {
    private String nome;
    private long matricula;
    private double[] notas;

    public Aluno() {
        this.nome = "";
        this.matricula = 0;
        this.notas = new double[3];
    }

    public void adicionarNota(double nota) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite a AV (1, 2 ou 3): ");
        int av = read.nextInt();
        
        this.notas[av-1] = nota;
    }

    public double calcularMedia() {
        return (this.notas[0]+this.notas[1]+this.notas[2])/3;
    }

    public void exibirInformacoes() {
        System.out.println("Matrícula: "+getMatricula());
        System.out.println("Nome: "+getNome());
        System.out.print("Média: "+calcularMedia());
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMatricula(long m) {
        this.matricula = m;
    }

    public long getMatricula() {
        return this.matricula;
    }
}
