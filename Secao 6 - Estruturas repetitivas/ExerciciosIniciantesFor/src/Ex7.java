import java.text.MessageFormat;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
        exemplo.*/

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(MessageFormat.format("{0} {1} {2}",i, Math.pow(i,2), Math.pow(i,3)));
        }
        sc.close();
    }
}
