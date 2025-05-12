public class Notas {
    double[] notas = {2.1, 3.2, 5.3, 7.4, 11.5};

    public Notas() {
        System.out.println("Notas lançadas.");
    }

    double getNota(int i) {
        return notas[i];
    }
}