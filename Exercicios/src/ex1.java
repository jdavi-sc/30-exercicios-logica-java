import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double num1;

        System.out.println("Digite o primeiro valor: ");
        num1 = sc.nextDouble();

        double num2;

        System.out.println("Digite o segundo valor: ");
        num2 = sc.nextDouble();

        double res = num1 + num2;
        double res1 = res + num1;

        System.out.println("A soma dos numeros: " + num1 + " + " + num2 + " = " + res);
        System.out.println("A multiplicação dos numeros: " + res + " * " + num1 + " = " + res1);

        sc.close();
    }
}