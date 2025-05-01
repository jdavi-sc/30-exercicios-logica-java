import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pesoL;
        System.out.println("Informe o peso do lutador: ");
        pesoL = sc.nextDouble();

        double pesoMax;
        System.out.println("Informe o peso maximo permitido: ");
        pesoMax = sc.nextDouble();

        if (pesoL <= pesoMax) {
            System.out.println("O lutador esta com o peso dentro do permitido para a sua categoria");
        } else if (pesoL > pesoMax) {
            System.out.println("O lutador esta com o peso acima do permitido para a sua categoria");
        }

        sc.close();
    }
}