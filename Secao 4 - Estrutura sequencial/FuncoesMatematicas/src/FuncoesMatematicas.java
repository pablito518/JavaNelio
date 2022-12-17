import java.text.MessageFormat;

public class FuncoesMatematicas {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println(MessageFormat.format("Raiz quadrada de {0} = {1,number,#.#############}", x, A));
        System.out.println(MessageFormat.format("Raiz quadrada de {0} = {1,number,#.##}", y, B));
        System.out.println(MessageFormat.format("Raiz quadrada de 25 = {0,number,#.##}", C));

        A = Math.pow(x,y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(MessageFormat.format("{0} elevado a {1} = {2}", x, y, A));
        System.out.println(MessageFormat.format("{0} elevado ao quadrado = {1}", x, B));
        System.out.println(MessageFormat.format("5 elevado ao quadrado = {0}", C));

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println(MessageFormat.format("Valor absoluto de {0} = {1}", y, A));
        System.out.println(MessageFormat.format("Valor absoluto de {0} = {1}", z, B));

        //incluindo em uma expressão maior

        int a = 1;
        int b = -1;
        int c = -12;

        double delta = Math.pow(b, 2.0) - 4*a*c;

        double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println(x1);
        System.out.println(x2);

    }
}
