public class Destroyer extends Ship {
    public Destroyer() {
        super(2, "Destroyer");

        super.addLocation(new Location(3, 0))
             .addLocation(new Location(3, 1));
    }
    
}
