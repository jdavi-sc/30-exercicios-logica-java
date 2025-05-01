import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        System.out.println("Digite o primeiro valor: ");
        num1 = sc.nextDouble();

        double num2;
        System.out.println("Digite o segundo valor: ");
        num2 = sc.nextDouble();

        double adicao = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("O resultado das equacoes são: " + "\n adicao: " + adicao + "\n subtracao: " + subtracao
                + "\n multiplicacao: " + multiplicacao + "\n divisao: " + divisao);

        sc.close();
    }
}