/**
 * this is the main class for all wedding packages and each wedding type has its own package name
 */
public abstract class WeddingPackage {

    private Venue venue;
    private Catering catering;
    private Decorations decorations;
    private Photography photography;
    /**
     * sets the venue for the wedding
     */
    public void setVenue(Venue venue) {
        this.venue = venue;
    }
    /**
     * sets the catering option
     */
    public void setCatering(Catering catering) {
        this.catering = catering;
    }
    /**
     * sets the decorations
     */
    public void setDecorations(Decorations decorations) {
        this.decorations = decorations;
    }
    /**
     * sets the photography option
     */
    public void setPhotography(Photography photography) {
        this.photography = photography;
    }
    /**
     * each wedding type gives its own name
     */
    public abstract String getPackageType();
    /**
     * shows all the information for the wedding package
     */
    public void showPackage() {

        // printing everything we picked for the wedding
        System.out.println("Wedding Package Type: " + getPackageType());
        System.out.println("Venue: " + venue);
        System.out.println("Catering: " + catering);
        System.out.println("Photography: " + photography);
        System.out.println("Decorations: " + decorations);
    }
}
