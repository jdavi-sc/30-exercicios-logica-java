import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double km;
        System.out.println("Informe o valor em kilometros que deseja converter para metros: ");
        km = sc.nextDouble();

        double conversao = km * 1000;
        System.out.println("O resultado da conversao em metros e: "+ conversao);

        sc.close();
    }
}