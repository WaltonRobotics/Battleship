public class Battleship extends Ship {
    public Battleship(Location location1, Location location2, Location location3, Location location4) {
        super(4, "Battleship");

        super.addLocation(location1)
             .addLocation(location2)
             .addLocation(location3)
             .addLocation(location4);
    }
}