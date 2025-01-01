package day13_practice_tasks.state_tasks;

public class State {
    // Attributes:
    private String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private int population;

    // Encapsulation Requirements:
    // Ensure attributes are private with getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("null")||name.isEmpty()||name.isBlank()){
            System.err.println("'name' must not be null, empty, or blank.");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation.equals("null")||abbreviation.isEmpty()||abbreviation.isBlank()){
            System.err.println("'abbreviation' must not be null, empty, or blank.");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty.equals("null")||politicalParty.isEmpty()||politicalParty.isBlank()){
            System.err.println("'politicalParty' must not be null, empty, or blank.");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor.equals("null")||governor.isEmpty()||governor.isBlank()){
            System.err.println("'governor' must not be null, empty, or blank.");
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator.equals("null")||senator.isEmpty()||senator.isBlank()){
            System.err.println("'senator' must not be null, empty, or blank.");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0){
            System.err.println("'population' must be greater than zero.");
            System.exit(1);
        }
        this.population = population;
    }

    // Constructor: Add a constructor to initialize all fields.

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    // Methods: toString(): Prints the information of the State object.

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
