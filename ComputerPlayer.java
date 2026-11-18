public class ComputerPlayer extends Player {
    int variable;
    public ComputerPlayer(String name) {
        super(name);
        variable = -1;
    }

    @Override
    public Location getAttackLocations(){
        variable ++;
        return new Location(variable/10, variable%10);
    }
}