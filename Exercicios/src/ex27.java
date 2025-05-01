import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int freq;
        System.out.println("Digite o numero de aulas previstas de sua disciplina durante o semestre");
        freq = sc.nextInt();

        int presenca = (freq * 75) / 100;
        System.out.println("O aluno precisa ter a presenca de no minimo " + presenca);

        sc.close();
    }
}