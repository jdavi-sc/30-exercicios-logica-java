import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = 20000.00;

        double saque;
        System.out.print("Digite o valor que deseja sacar: ");
        saque = sc.nextDouble();

        double salFinal = salario - saque;
        System.out.println("Saque de " + saque + " reais efetuado com sucesso" + "\n" + " Saldo atual de " + salFinal);

        sc.close();
    }
}