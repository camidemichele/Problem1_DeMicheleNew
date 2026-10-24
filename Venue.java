/**
 * stores the venue chosen for the wedding
 */
public class Venue {

    private String name;
    /**
     * creates a venue with the name i choose
     */
    public Venue(String name) {
        this.name = name;
    }
    /**
     * returns the venue name when printed
     */
    @Override
    public String toString() {
        return name;
    }
}
