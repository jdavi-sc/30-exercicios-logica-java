import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        System.out.println("Digite o primeiro valor: ");
        num1 = sc.nextDouble();
        double num2;
        System.out.println("Digite o segundo valor: ");
        num2 = sc.nextDouble();
        double num3;
        System.out.println("Digite o terceiro valor: ");
        num3 = sc.nextDouble();
        double num4;
        System.out.println("Digite o quarto valor: ");
        num4 = sc.nextDouble();

        double res1 = num1 * num1;
        double res2 = num2 * num2;
        double res3 = num3 * num3;
        double res4 = num4 * num4;

        System.out.println("O primeiro valor resulta em " + res1 + "\n" + "O segundo valor resulta em " + res2 + "\n" + "O terceiro valor resulta em " + res3 + "\n" + "O quarto valor resulta em " + res4);
        
        sc.close();
    }
}