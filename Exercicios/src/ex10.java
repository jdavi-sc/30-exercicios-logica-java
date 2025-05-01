import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ml;
        System.out.println("Informe o valor em mililitros que deseja converter para litros: ");
        ml = sc.nextDouble();

        double conversao = ml / 1000;
        System.out.println("o resultado da conversao e: " + conversao);

        sc.close();
    }
}