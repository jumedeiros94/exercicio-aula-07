import java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int IdadeAnos, IdadeMeses, IdadeDias, IdadeTotalDias;

        System.out.print("Digite os anos: ");
        IdadeAnos = entrada.nextInt();

        System.out.print("Digite os meses: ");
        IdadeMeses = entrada.nextInt();

        System.out.print("Digite os dias: ");
        IdadeDias = entrada.nextInt();


        IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
        System.out.print("Idade total em dias = " + IdadeTotalDias);
    }
}
