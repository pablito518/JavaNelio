import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.

        int num, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os numeros a serem somados:");

        num = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("SOMA = " + (num + num2));
        sc.close();
    }
}
