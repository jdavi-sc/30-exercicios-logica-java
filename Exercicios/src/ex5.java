import java.util.Scanner;

public class ex5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso;
        System.out.println("Informe seu peso: ");
        peso = sc.nextDouble();

        double altura;
        System.out.println("Informe sua altura: ");
        altura = sc.nextDouble();

        double imc = peso/(altura * altura);

        System.out.println("Seu IMC e de: " + imc);

        sc.close();
    }
}