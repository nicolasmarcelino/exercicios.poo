import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notas not = new Notas();
        Calculadora calc = new Calculadora();
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Dividir ");
        int a = read.nextInt();

        System.out.print("por ");
        int b = read.nextInt();

        try {
            System.out.println(calc.dividir(a,b));
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero.");
        } finally {
            read.close();
        }

        try {
            System.out.println(not.getNota(8));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: nota não existe.");
        }
    }
}