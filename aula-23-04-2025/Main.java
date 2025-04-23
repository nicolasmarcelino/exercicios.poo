public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("ABC-1234", "Fiat Uno", 4);
        Veiculo moto = new Moto("XYZ-5678", "Yamaha YZF", 600);

        Veiculo[] veiculos = { carro, moto };

        for (Veiculo v : veiculos) {
            v.exibirDados();
            v.alugar();

            v.exibirDados();
            v.alugar();
        }
    }
}