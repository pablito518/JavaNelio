import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        double numerador, denominador;

        for (int i = 0; i < nums; i++) {
            numerador = sc.nextDouble();
            denominador = sc.nextDouble();

            if(denominador != 0){
                System.out.println(numerador / denominador);
            }
            else {
                System.out.println("Divisao impossivel");
            }

        }

        sc.close();

    }
}
