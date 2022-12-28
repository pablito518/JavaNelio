package entities;

import java.text.MessageFormat;

public class Account {
    private int number;
    private String name;
    private double balance;

    public Account(int number, String name, double saldo){
        this.number = number;
        this.name = name;
        this.balance = saldo;
    }
    public Account(int number, String name){
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double valor){
        this.balance -= valor + 5;
    }

    public void deposit(double valor){
        this.balance += valor;
    }

    @Override
    public String toString(){
        return MessageFormat.format("Account {0}, Holder: {1}, Balance: $ {2}", number, name, balance);
    }
}
