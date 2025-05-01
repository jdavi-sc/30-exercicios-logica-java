import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double peso;

        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();

        double qntdAgua = peso * 0.040;

        System.out.println("Voce deve beber " + qntdAgua + " litros");

        sc.close();
    }
}