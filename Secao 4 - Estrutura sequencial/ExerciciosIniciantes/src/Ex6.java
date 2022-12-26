import java.text.MessageFormat;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.*/

        Scanner sc = new Scanner(System.in);

        double A, B, C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double areaTriangulo = (A * C)/2;
        double areaCirculo = Math.PI * Math.pow(C, 2);
        double areaTrapezio = ((A + B) * C)/2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;


        System.out.println(MessageFormat.format(
        "Triangulo: {0}\nCirculo: {1}\nTrapezio: {2}\nQuadrado: {3}\nRetangulo: {4}",
        areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo));

    }
}
