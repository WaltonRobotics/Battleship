public class Carrier extends Ship {
    public Carrier(Location location1, Location location2, Location location3, Location location4, Location location5) {
        super(5, "Carrier");

        super.addLocation(location1, location2, location3, location4, location5);
    }
}
