public class Battleship extends Ship {
    public Battleship() {
        super(4, "Battleship");
    
        super.addLocation(new Location (0,0))
             .addLocation(new Location (0,1))
             .addLocation(new Location (0,2))
             .addLocation(new Location (0,3));
    }
}