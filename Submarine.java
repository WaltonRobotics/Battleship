public class Submarine extends Ship {
    public Submarine(Location location1, Location location2, Location location3) {
        super(3, "Submarine");

        super.addLocation(location1, location2, location3);
    }
}
