public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }

    @Override 
    public Location getAttackLocations() {
        return new Location(0, 0);
    };
}