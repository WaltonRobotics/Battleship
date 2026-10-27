public class Submarine extends Ship {
    public Submarine() {
        super(3, "Submarine");

        super.addLocation(new Location(1,2))
             .addLocation(new Location(2,2))
             .addLocation(new Location(3,2));
    }
}
