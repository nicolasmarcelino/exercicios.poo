public class Carro extends Veiculo {
    String placa;
    String modelo;
    int portas;
    boolean alugado;
    
    public Carro(String placa, String modelo, int portas) {
        this.placa = placa;
        this.modelo = modelo;
        this.portas = portas;
        this.alugado = false;
    }

    @Override
    public void alugar() {
        if (alugado) {
            System.out.println("O carro já foi alugado!");
        } else {
            this.alugado = true;
        }
    }

    @Override
    public void devolver() {
        if (alugado) {
            this.alugado = false;
        } else {
            System.out.println("O carro já havia sido devolvido!");
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("\nTipo de veículo: carro");
        System.out.println("Placa: "+this.placa);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Número de portas: "+this.portas);
        if (this.alugado) {
            System.out.println("Status: alugado."+"\n");
        } else {
            System.out.println("Status: disponível."+"\n");
        }
    }    
}
