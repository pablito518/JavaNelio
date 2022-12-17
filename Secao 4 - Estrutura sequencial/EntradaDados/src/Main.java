import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double altura;
        char sexo;

        System.out.println("Qual eh seu some?");
        nome = sc.next();

        System.out.println("E qual a sua idade?");
        idade = sc.nextInt();

        System.out.println("Qual sua altura?");
        /*para ler a altura com ponto, seria usado o
        Locale.setDefault(Locale.US)*/
        altura = sc.nextDouble();

        System.out.println("Qual seu sexo?");
        sexo = sc.next().charAt(0);

        System.out.printf("Seus dados: Seu nome eh %s, voce tem %d anos" +
                ", possui %.2f de altura e eh do sexo %c\n", nome, idade, altura, sexo);


        //Para ler ate a quebra de linha

        String s1, s2, s3;
        sc.nextLine(); //usado para limpar o buffer de leitura 
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
