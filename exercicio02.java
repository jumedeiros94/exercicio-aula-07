import java.util.Scanner;
public class exercicio02 {
    public static void main(String[] args) {
        Scanner pesoDoCalculo = new Scanner(System.in);
        System.out.println("Digite seu peso");
        double peso = pesoDoCalculo.nextDouble();

        Scanner alturaDoCalculo = new Scanner(System.in);
        System.out.println("Digite sua altura");
        double altura = alturaDoCalculo.nextDouble();

        double calculoImc = peso / (altura * altura);