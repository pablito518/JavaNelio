package entities;

import java.text.MessageFormat;

public class Employee {
    private int id;
    private String nome;
    private double salary;

    public Employee(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salary = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
         salary += salary * (percentage / 100);
    }

    @Override
    public String toString(){
        return MessageFormat.format("{0}, {1}, {2}", getId(), getNome(), getSalary());
    }

}
