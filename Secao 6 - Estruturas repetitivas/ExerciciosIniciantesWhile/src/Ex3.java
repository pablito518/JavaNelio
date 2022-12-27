import java.text.MessageFormat;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo.*/

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        int alcool = 0, gasolina = 0, diesel = 0;


        while(option != 4){
            switch (option) {
                case 1 -> alcool += 1;
                case 2 -> gasolina += 1;
                case 3 -> diesel += 1;
                default -> System.out.println("Digite um codigo valido");
            }
            option = sc.nextInt();
        }
        System.out.println(MessageFormat.format("Muito obrigado\nAlcool: {0}\nGasolina: {1}\nDiesel: {2}", alcool, gasolina, diesel));
        sc.close();
    }
}
