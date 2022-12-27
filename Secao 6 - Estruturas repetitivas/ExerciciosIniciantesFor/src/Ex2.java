import java.text.MessageFormat;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt(),num = 0, in = 0, out = 0;

        for (int i = 0; i < nums; i++) {
            num = sc.nextInt();
            if(num >= 10 && num <= 20){
                in += 1;
            }
            else{
                out += 1;
            }

        }
        System.out.println(MessageFormat.format("{0} in\n{1} out", in, out));

    }
}
