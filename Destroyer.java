public class Destroyer extends Ship {
    public Destroyer() {
        super(2, "Destroyer");

        super.addLocation(new Location(5, 2))
             .addLocation(new Location(6, 2));
    }
    
}
