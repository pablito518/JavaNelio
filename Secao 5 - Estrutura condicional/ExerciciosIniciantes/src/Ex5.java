import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
    /*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
    seguir, calcule e mostre o valor da conta a pagar.*/

    /*Codigo    Especificacao       Preco
        1       Cachorro quente     R$ 4.00
        2       X-Salada            R$ 4.50
        3       X-Bacon             R$ 5.00
        4       Torrada simples     R$ 2.00
        5       Refrigerante        R$ 1.50
     */
        Scanner sc = new Scanner(System.in);
        int codItem, qtItem;
        double precoTotal = 0;
        codItem = sc.nextInt();
        qtItem = sc.nextInt();

        switch (codItem) {
            case 1 -> precoTotal = qtItem * 4;
            case 2 -> precoTotal = qtItem * 4.50;
            case 3 -> precoTotal = qtItem * 5;
            case 4 -> precoTotal = qtItem * 2;
            case 5 -> precoTotal = qtItem * 1.5;
            default -> System.out.println("Escolha um item valido!");
        }
        System.out.println("Total: R$" + precoTotal);



    }
}
