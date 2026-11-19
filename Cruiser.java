public class Cruiser extends Ship {
    public Cruiser(Location location1, Location location2, Location location3) {
        super(3, "Cruiser");

        super.addLocation(location1, location2, location3);
    }
    
}   