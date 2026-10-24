/**
 * stores the decoration style for the wedding
 */
public class Decorations {

    private String name;
    /**
     * creates the decorations i want
     */
    public Decorations(String name) {
        this.name = name;
    }
    /**
     * returns the decoration name when it prints
     */
    @Override
    public String toString() {
        return name;
    }
}
