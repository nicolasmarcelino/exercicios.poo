abstract class Produto implements Vendavel {
    String nome;
    double precoBase;

    Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    abstract void exibirInformacoes();

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }
}
