public class Cruiser extends Ship{
    public Cruiser(){
        super(3,"Cruiser");
        super.addLocation(new Location(2,2))
            .addLocation(new Location(2,3));    
    }
}