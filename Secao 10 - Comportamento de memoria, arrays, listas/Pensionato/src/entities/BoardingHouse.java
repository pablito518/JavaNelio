package entities;

public class BoardingHouse {

    private static BoardingHouse instance;

    private BoardingHouse(){

    }
    public static BoardingHouse getInstance(){
        if (instance == null){
            instance = new BoardingHouse();
        }
        return instance;
    }
    private Renter[] renters = new Renter[10];

    public void rentRoom(Renter renter, int room){
        renters[room] = renter;
    }

    public Renter showBusyRooms(int room){
            if(renters[room] != null){
                return renters[room];
            }
        return null;
    }
}
