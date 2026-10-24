/**
 * creates different wedding packages depending on the type
 */
public class WeddingFactory {
    /**
     * creates the wedding package we ask for
     */
    public WeddingPackage createWedding(String type) {

        // checking which wedding package we want
        if (type.equalsIgnoreCase("Luxury")) {
            return new LuxuryWedding();
        }

        if (type.equalsIgnoreCase("Traditional")) {
            return new TraditionalWedding();
        }

        if (type.equalsIgnoreCase("Destination")) {
            return new DestinationWedding();
        }

        // just in case the wedding type doesn't exist
        throw new IllegalArgumentException("Unknown wedding type: " + type);
    }
}
