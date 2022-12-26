import java.text.MessageFormat;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        /*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio^2
        Considere o valor de π = 3.14159*/

        double pi = 3.14159;
        double raio = 0;
        double area = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor da área do circulo: ");

        raio = sc.nextDouble();
        area = pi * Math.pow(raio,2);

        System.out.println(MessageFormat.format("A = {0,number,#.####}", area));

        sc.close();
    }
}
