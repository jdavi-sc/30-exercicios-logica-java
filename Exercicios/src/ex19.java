import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double reais = 5.37;

        double dollar;
        System.out.println("Digite em dollar o que deseja converter para reais");
        dollar = sc.nextDouble();

        double conversao = reais * dollar;

        System.out.println("O valor convertido sera de " + conversao + " reais");

        sc.close();
    }
}