public class Battleship extends Ship {
    public Battleship(Location location1, Location location2, Location location3, Location location4) {
        super(4, "Battleship");

        super.addLocation(location1, location2, location3, location4);
    }
}