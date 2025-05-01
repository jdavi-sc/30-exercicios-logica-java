import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do seu salario: ");
        double salario = sc.nextDouble();

        double bonus = salario * 0.10;
        double salarioComBonus = salario + bonus;

        System.out.println("Bonus de: "+ bonus);
        System.out.println("Salario com bônus de: " + salarioComBonus);
        
        sc.close();
    }
}