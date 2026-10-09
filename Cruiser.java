public class Cruiser extends Ship {
    public Cruiser() {
        super(3, "Cruiser"); 
        super.addLocation(new Location(1, 1))
            .addLocation(new Location(1, 2));
    }
}   