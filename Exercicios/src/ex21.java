import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorU;
        System.out.println("Digite o valor unitario do produto: ");
        valorU = sc.nextDouble();

        double pecaV;
        System.out.println("Digite a quantidade de pecas vendidas: ");
        pecaV = sc.nextInt();

        double totalV = valorU * pecaV;

        double porcentagem = 5;

        double porcent = 100 / (totalV * porcentagem);

        System.out.println("A comissao do funcionario em relacao a pecas vendidas e de " + porcent);

        sc.close();
    }
}