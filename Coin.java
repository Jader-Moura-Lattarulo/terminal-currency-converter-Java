public class Coin {
    private String name;
    private String abbreviation;
    private double value;

    public Coin (String name, String abbreviation, double value) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public double getValue() {
        return value;
    }
}

