import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hrs;
        System.out.println("Informe o valor em horas que deseja converter para minutos: ");
        hrs = sc.nextDouble();

        double conversao = hrs * 60;
        System.out.println("O resultado da conversao em minutos e: " +conversao);

        sc.close();
    }
}