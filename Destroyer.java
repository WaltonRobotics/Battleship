public class Destroyer extends Ship {
    public Destroyer(Location location1, Location location2) {
        super(2, "Destroyer");

        super.addLocation(location1, location2);
    }
    
}
