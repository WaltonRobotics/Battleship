public class Carrier extends Ship {
    public Carrier() {
        super(5, "Carrier");
        super.addLocation(new Location(1, 1))
             .addLocation(new Location(1, 2))
             .addLocation(new Location(1, 3))
             .addLocation(new Location(1, 4))
             .addLocation(new Location(1, 5));
    }
}
