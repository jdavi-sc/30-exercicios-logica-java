import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double met;
        System.out.println("Informe o valor em metros que deseja converter para centimetros");
        met = sc.nextDouble();

        double conversao = met * 100;
        System.out.println("o resultado da conversao em centimetros e: " + conversao);

        sc.close();
    }   
}