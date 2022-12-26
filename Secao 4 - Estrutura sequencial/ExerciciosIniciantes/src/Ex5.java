import java.text.MessageFormat;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

        Scanner sc = new Scanner(System.in);
        int codPeca, qtPeca;
        double valorPeca, total;

        System.out.println("Entre com o codigo da peca, quantidade de pecas e o valor de cada peca");

        codPeca = sc.nextInt();
        qtPeca = sc.nextInt();
        valorPeca = sc.nextDouble();

        total = qtPeca * valorPeca;

        System.out.println("Entre com o codigo da peca, quantidade de pecas e o valor de cada peca");

        codPeca = sc.nextInt();
        qtPeca = sc.nextInt();
        valorPeca = sc.nextDouble();

        total += qtPeca * valorPeca;

        System.out.println(MessageFormat.format("Valor a pagar: {0,number,#.##}", total));
        sc.close();
    }
}
