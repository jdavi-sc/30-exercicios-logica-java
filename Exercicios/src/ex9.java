import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double L;
        System.out.println("Informe o valor em litros que deseja converter para mililitros");
        L = sc.nextDouble();

        double conversao = L * 1000;
        System.out.println("O resultado da conversao é: " + conversao);

        sc.close();
    }
}