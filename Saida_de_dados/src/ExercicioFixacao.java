import java.util.Locale;

public class ExercicioFixacao {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c\n\n", age, code, gender);
        System.out.println("Measure with eight decimal places: " + String.format("%.8f", measure));
        System.out.println("Rounded (three decimal places): " + String.format("%.3f", measure));
        Locale.setDefault(Locale.US);
        System.out.println("US decimal point: " + String.format("%.3f",measure));
    }
}
