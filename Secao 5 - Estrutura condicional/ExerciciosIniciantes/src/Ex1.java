import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("NEGATIVO");
        }
        else{
            System.out.println("NAO NEGATIVO");
        }

        sc.close();
    }
}