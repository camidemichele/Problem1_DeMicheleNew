/**
 * tests the wedding planning system and the design patterns
 */
public class Main {
    /**
     * starts the program
     */
    public static void main(String[] args) {
        // getting the only wedding planner
        WeddingPlanner planner = WeddingPlanner.getInstance();
        // creating a luxury wedding with the factory
        WeddingPackage luxury = planner.createWedding("Luxury");
        // customizing the luxury wedding using the builder
        luxury = new WeddingPackageBuilder(luxury)
                .setVenue(new Venue("Grand Palace"))
                .setCatering(new Catering("Gourmet Buffet"))
                .setPhotography(new Photography("Professional Photography"))
                .setDecorations(new Decorations("Elegant Flowers"))
                .build();

        System.out.println("Planning Luxury Wedding:");
        planner.planWedding(luxury);

        System.out.println();

        // creating a traditional wedding with the factory
        WeddingPackage traditional = planner.createWedding("Traditional");

        // picking the options for the traditional wedding
        traditional = new WeddingPackageBuilder(traditional)
                .setVenue(new Venue("Country Club"))
                .setCatering(new Catering("Classic Buffet"))
                .setPhotography(new Photography("Local Photographer"))
                .setDecorations(new Decorations("Traditional Flowers"))
                .build();

        System.out.println("Planning Traditional Wedding:");
        planner.planWedding(traditional);

        System.out.println();

        // testing the destination wedding too
        WeddingPackage destination = planner.createWedding("Destination");

        destination = new WeddingPackageBuilder(destination)
                .setVenue(new Venue("Beach"))
                .setCatering(new Catering("Classic Buffet"))
                .setPhotography(new Photography("Professional Photography"))
                .setDecorations(new Decorations("No Flowers"))
                .build();

        System.out.println("Planning Destination Wedding:");
        planner.planWedding(destination);

        System.out.println();

        // getting the planner again to check if it's the same one
        WeddingPlanner secondPlanner = WeddingPlanner.getInstance();

        System.out.println("Same WeddingPlanner instance? "
                + (planner == secondPlanner));
    }
}
