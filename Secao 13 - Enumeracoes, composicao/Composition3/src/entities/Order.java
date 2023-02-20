package entities;

import enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;
    List<OrderItem> items = new ArrayList<>();
    public Order(){

    }
    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        double sum = 0;
        for (OrderItem item: items) {
            sum+=item.subTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMARRY:\n");
        sb.append("Order moment: ");
        sb.append(moment.format(fmt)).append("\n");
        sb.append("Order status: ");
        sb.append(status).append("\n");
        sb.append("Client: ").append(client.getName()).append(" (");
        sb.append(client.getBirthDate()).append(") - ");
        sb.append(client.getEmail()).append("\n");
        sb.append("Order items:\n");
        for (OrderItem item : items) {
            sb.append(String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f \n",item.getProduct().getName(), item.getPrice(),
                    item.getQuantity(), item.subTotal()));
        }
        sb.append("Total Price: $").append(String.format("%.2f",total()));
        return sb.toString();
    }
}
