import java.util.Scanner;

public class ex7 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salFixo = 2000;
        double bonus = 100;

        int qntdCarrosVendidos;
        System.out.println("Quantos carros foram vendidos? ");
        qntdCarrosVendidos = sc.nextInt();

        double salAtual = salFixo + (bonus * qntdCarrosVendidos);

        System.out.println("Voce vendeu " + qntdCarrosVendidos + " carros e seu salario sera de " + salAtual);

        sc.close();
    }
}