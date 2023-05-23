public class exercicio01 {
    public static void main(String[] args) {

        double peso = 135.5;
        int pesoLimite = 50;
        double excesso = peso - pesoLimite;
        double multa = excesso * 4;

        System.out.println("Você excedeu " + excesso + "KG, sua multa é de: R$" + multa);

    }
}