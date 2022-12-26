import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

        Scanner sc = new Scanner(System.in);

        int inicio, fim, duracao;

        inicio = sc.nextInt();
        fim = sc.nextInt();

        if (inicio < fim) {
            duracao = inicio - fim;
        }
        else {
            duracao = 24 - inicio + fim;
        }
        System.out.println("O jogo durou " + duracao + " hora(s)");

    }
}
