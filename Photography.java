/**
 * stores the photography option for the wedding
 */
public class Photography {

    private String name;
    /**
     * creates the photography option
     */
    public Photography(String name) {
        this.name = name;
    }
    /**
     * returns the photography name when we print it
     */
    @Override
    public String toString() {
        return name;
    }
}
