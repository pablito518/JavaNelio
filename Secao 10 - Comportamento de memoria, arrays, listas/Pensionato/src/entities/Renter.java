package entities;

public class Renter {
    private String name;
    private String email;

    private int room;
    public Renter(String nome, String email, int room) {
        this.name = nome;
        this.email = email;
        this.room = room;
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
