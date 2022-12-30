package entities;

public class Renter {
    private String name;
    private String email;

    private int rentedRoom;
    public Renter(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.rentedRoom = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
