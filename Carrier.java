public class Carrier extends Ship {
    public Carrier(Location location1, Location location2, Location location3, Location location4, Location location5) {
        super(5, "Carrier");

        super.addLocation(location1)
             .addLocation(location2)
             .addLocation(location3)
             .addLocation(location4)
             .addLocation(location5);

    }
}
