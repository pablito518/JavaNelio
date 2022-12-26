import java.text.MessageFormat;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.*/

        Scanner sc = new Scanner(System.in);

        int number;
        double hoursWorked, valuePerHour, salary;

        System.out.println("Entre com o numero, horas trabalhadas e o salario por hora");

        number = sc.nextInt();
        hoursWorked = sc.nextDouble();
        valuePerHour = sc.nextDouble();
        salary = hoursWorked * valuePerHour;

        System.out.println(MessageFormat.format("Number = {0}\nSalary = U$ {1,number,#.##}", number, salary));

        sc.close();
    }
}
