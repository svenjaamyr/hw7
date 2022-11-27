public class ChinaWomensArtisticGymnastics implements Team{
    private String name = "Women's Artistic Gymnastics";
    private int athletes;
    private int medals;

    public ChinaWomensArtisticGymnastics(int athletes, int medals) {
        this.athletes = athletes;
        this.medals = medals;
    }

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
        System.out.println("Team: " + name + ", Number of Athletes: " + athletes);
    }

    @Override
    public void printNameAndMedals() {
        System.out.println("Team: " + name + ", Number of Gold Medals: " + medals);
    }
}
