/**
 * builds a wedding package by adding the options
 */
public class WeddingPackageBuilder {

    private WeddingPackage weddingPackage;
    /**
     * starts the builder with the wedding package
     */
    public WeddingPackageBuilder(WeddingPackage weddingPackage) {
        this.weddingPackage = weddingPackage;
    }
    /**
     * chooses the wedding venue
     */
    public WeddingPackageBuilder setVenue(Venue venue) {
        weddingPackage.setVenue(venue);
        return this; // lets us keep adding options
    }
    /**
     * chooses the catering option
     */
    public WeddingPackageBuilder setCatering(Catering catering) {
        weddingPackage.setCatering(catering);
        return this;
    }
    /**
     * chooses the decorations.
     */
    public WeddingPackageBuilder setDecorations(Decorations decorations) {
        weddingPackage.setDecorations(decorations);
        return this;
    }
    /**
     * chooses the photography option
     */
    public WeddingPackageBuilder setPhotography(Photography photography) {
        weddingPackage.setPhotography(photography);
        return this;
    }
    /**
     * returns the finished wedding package
     */
    public WeddingPackage build() {

        // all the selected options are already in the package
        return weddingPackage;
    }
}
