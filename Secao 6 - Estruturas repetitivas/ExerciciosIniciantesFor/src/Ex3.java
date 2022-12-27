import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
        de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
        conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
        peso 5.*/

        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        double first, second, third;

        for (int i = 0; i <= nums; i++) {
            first = sc.nextDouble();
            second = sc.nextDouble();
            third = sc.nextDouble();

            double result = (first * 2 + second * 3 + third * 5)/(2 + 3 + 5);
            System.out.printf("%.1f\n", result);

            sc.close();
        }

    }
}
