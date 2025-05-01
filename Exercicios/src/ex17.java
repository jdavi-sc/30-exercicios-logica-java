import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double seg;
        System.out.println("Informe o valor em segundos que deseja converter para minutos: ");
        seg = sc.nextDouble();

        double conversao = seg / 60;
        System.out.println("O resultado da conversao em minutos é: " +conversao);

        sc.close();
    }
}