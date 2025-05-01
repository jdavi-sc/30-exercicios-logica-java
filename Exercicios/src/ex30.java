import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double respiracao;
        System.out.println("Informe o valor de sua frequencia respiratoria: ");
        respiracao = sc.nextDouble();

        if (respiracao < 12) {
            System.out.println("BRADIPNEIA");
        } else if (respiracao < 60 && respiracao > 100) {
            System.out.println("EUPNEIA");
        } else if (respiracao >= 100) {
            System.out.println("TAQUIPNEIA");
        }

        sc.close();
    }
}