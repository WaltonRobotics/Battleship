public class Submarine extends Ship {
    public Submarine() {
        super(3, "Submarine");

        super.addLocation(new Location(5,2))
             .addLocation(new Location(5,3))
             .addLocation(new Location(5,4));
    }
}
