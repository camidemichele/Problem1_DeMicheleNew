/**
 * manages the wedding planning system and the singleton makes sure we only have one planner
 */
public class WeddingPlanner {

    // keeping the only planner instance
    private static WeddingPlanner instance;
    /**
     * private constructor so no other class can create a planner
     */
    private WeddingPlanner() {
    }
    /**
     * gets the only wedding planner instance
     */
    public static WeddingPlanner getInstance() {

        // making the planner only the first time
        if (instance == null) {
            instance = new WeddingPlanner();
        }

        return instance;
    }
    /**
     * creates a wedding package using the factory
     */
    public WeddingPackage createWedding(String type) {

        // using the factory only when we need a wedding
        WeddingFactory factory = new WeddingFactory();

        return factory.createWedding(type);
    }
    /**
     * displays the wedding we are planning
     */
    public void planWedding(WeddingPackage wedding) {

        System.out.println("Planning " + wedding.getPackageType() + "...");
        wedding.showPackage();
    }
}
