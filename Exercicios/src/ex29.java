import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bpm;
        System.out.println("Informe o valor de sua frequencia cardiaca: ");
        bpm = sc.nextDouble();

        int freqcardiaca = 0;

        if (bpm < 60) {
            System.out.println("BRAQUICARDIA");
        } else if (freqcardiaca < 60 && bpm >= 100) {
            System.out.println("TAQUICARDIA");
        } else {
            System.out.println("NORMOCARDIA");
        }

        sc.close();
    }
}