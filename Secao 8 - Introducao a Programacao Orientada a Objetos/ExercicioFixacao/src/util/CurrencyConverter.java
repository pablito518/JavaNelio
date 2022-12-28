package util;

public class CurrencyConverter {
    private static double IOF = 0.06;

    public static double exchange(double price, double quantity){
        return ((price * IOF) + price) * quantity;
    }
}
