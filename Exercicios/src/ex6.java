import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        
        double salFixo = 4500;
        double bugResolvido = 200;

        int qntdBug;
        System.out.println("Quantos bugs voce encontrou?");
        qntdBug = sc.nextInt();

        System.out.println("Quantos bugs foram resolvidos?");
        qntdBug = sc.nextInt();

        double salAtual = salFixo + (qntdBug * bugResolvido);

        System.out.println("Voce resolveu "+ qntdBug + " bugs e seu salario sera de "+ salAtual);

        sc.close();
    }
}