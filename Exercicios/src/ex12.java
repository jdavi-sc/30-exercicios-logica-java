import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cm;
        System.out.println("Informe o valor em centimetros que deseja converter para metros: ");
        cm = sc.nextDouble();

        double conversao = cm / 100;
        System.out.println("O resultado da conversao em metros e: " + conversao);

        sc.close();
    }
}