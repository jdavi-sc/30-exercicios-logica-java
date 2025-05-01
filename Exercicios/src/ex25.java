import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double velocidade;
        System.out.println("Informe a velocidade: ");
        velocidade = sc.nextDouble();

        if (velocidade > 90) {
            System.out.println("REGISTRO DE INFRAÇÃO POR EXCESSO DE VELOCIDADE PERMITIDO NA VIA");
        } else if (velocidade <= 90) {
            System.out.println("VELOCIDADE DO AUTOMOVEL ESTA ABAIXO DO LIMITE DA VIA");
        }

        sc.close();
    }
}