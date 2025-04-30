public abstract class Acao {
    int hora;
    int data;
    String nome;

    public Acao(int hora, int data) {
        this.hora = hora;
        this.data = data;
        this.nome = nome;
    }

    public int getData() {
        return this.data;
    }

    public int getHora() {
        return this.hora;
    }

    public String getNome() {
        return this.nome;
    }
}