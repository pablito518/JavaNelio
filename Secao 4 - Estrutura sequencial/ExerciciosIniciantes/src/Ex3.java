import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("Entre com quatro numeros inteiros");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        System.out.println("DIFERENCA = " + (a * b - c * d));
        sc.close();
    }
}
