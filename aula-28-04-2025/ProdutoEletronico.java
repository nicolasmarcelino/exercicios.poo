class ProdutoEletronico extends Produto {
    int garantiaMeses;

    public ProdutoEletronico(String nome, double precoBase, int garantiaMeses) {
        super(nome, precoBase);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public double calcularPrecoFinal() {
        double taxa = this.getPrecoBase() * 0.1;
        return this.getPrecoBase() + taxa;
    }

    @Override
    void exibirInformacoes() {
        System.out.println("Produto: "+this.getNome());
        System.out.println("Preço base: "+this.getPrecoBase());
        System.out.println("Garantia: "+this.getGarantiaMeses()+" meses");

    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

}
