import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double min;
        System.out.println("Informe o valor em minutos que deseja converter para segundos: ");
        min = sc.nextDouble();

        double conversao = min * 60;
        System.out.println("O resultado da conversao em segundos é: " + conversao);

        sc.close();
    }
}