package exercicio2.entities;

import java.text.MessageFormat;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        grossSalary += grossSalary * (percentage / 100);
    }

    @Override
    public String toString(){
        return MessageFormat.format("{0}, $ {1}", name, netSalary());
    }
}
