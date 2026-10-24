/**
 * stores the catering option for the wedding
 */
public class Catering {

    private String name;
    /**
     * creates the catering option
     */
    public Catering(String name) {
        this.name = name;
    }
    /**
     * returns the catering name when we print it
     */
    @Override
    public String toString() {
        return name;
    }
}
