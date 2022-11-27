import java.util.ArrayList;
import java.util.List;

public class GermanyWomens implements Team{
    private String name = "Germany Women's";
    private int athletes = 0;
    private int medals = 0;
    private List<Team> childTeams = new ArrayList<Team>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAthletes() {
        return athletes;
    }

    public void setAthletes(int athletes) {
        this.athletes = athletes;
    }

    public int getMedals() {
        return medals;
    }

    public void setMedals(int medals) {
        this.medals = medals;
    }

    @Override
    public void printNameAndAthletes() {
        System.out.println(name);
        for (Team t : childTeams) {
            System.out.print("    ");
            t.printNameAndAthletes();
        }
    }

    @Override
    public void printNameAndMedals() {
        System.out.println(name);
        for (Team t : childTeams) {
            System.out.print("    ");
            t.printNameAndMedals();
        }
    }

    public void addTeam(Team team) {
        childTeams.add(team);
        athletes += team.getAthletes();
        medals += team.getMedals();
    }

    public void removeTeam(Team team) {
        childTeams.remove(team);
        athletes -= team.getAthletes();
        medals -= team.getMedals();
    }
}
