package entitites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Timer;

public class UsedProduct extends Product{

    private LocalDate manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() + " (used) " + getPrice() + " (Manufacture date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) + ")";
    }


}
