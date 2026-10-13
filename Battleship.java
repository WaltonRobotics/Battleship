public class Battleship extends Ship {
    public Battleship() {
        super(4, "Battleship");
    
        super.addLocation(new Location (1,1))
            .addLocation(new Location (1,2))
            .addLocation(new Location (1,3))
            .addLocation(new Location (1,4));
    }

}