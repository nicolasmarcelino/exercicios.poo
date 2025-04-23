public class Moto extends Veiculo {
    String placa;
    String modelo;
    int cilindradas;
    boolean alugado;
    
    public Moto(String placa, String modelo, int cilindradas) {
        this.placa = placa;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
        this.alugado = false;
    }

    @Override
    public void alugar() {
        if (alugado) {
            System.out.println("A moto já foi alugada!");
        } else {
            this.alugado = true;
        }
    }

    @Override
    public void devolver() {
        if (alugado) {
            this.alugado = false;
        } else {
            System.out.println("A moto já havia sido devolvida!");
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("\nTipo de veículo: moto");
        System.out.println("Placa: "+this.placa);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cilindradas: "+this.cilindradas);
        if (alugado) {
            System.out.println("Status: alugada."+"\n");
        } else {
            System.out.println("Status: disponível."+"\n");
        }
    }
}
