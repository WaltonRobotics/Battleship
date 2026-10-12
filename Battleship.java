public class Battleship extends Ship {
    public Battleship(int length, String name) {
        super(4, "Battleship");

        Location location1 = new Location(9, 3);
        Location location2 = new Location(9, 4);
        Location location3 = new Location(9, 5);
        Location location4 = new Location(9, 6);

        super.addLocation(location1)
                .addLocation(location2)
                .addLocation(location3)
                .addLocation(location4);

    }

}