import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner valorSalario = new Scanner(System.in);
        System.out.println("Digite seu salario");
        double seuSalario = valorSalario.nextDouble();

        double salarioMinimo = 1.212;

        double quantidadeSalariosMinimos = (seuSalario / salarioMinimo);

        System.out.println("A quantidade de salário minimo que você ganha é " + quantidadeSalariosMinimos);


    }
}