import java.util.Scanner;

public class ex3 {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        double anoA;

        System.out.println("Digite o ano atual: ");
        anoA = sc.nextDouble();

        double anoNas;

        System.out.println("Digite o ano de nascimento");
        anoNas = sc.nextDouble();

        double res = anoA - anoNas;

        System.out.println("Voce tem " + res + " anos de idade");

        sc.close();
    }
}
