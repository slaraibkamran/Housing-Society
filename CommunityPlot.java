public class CommunityPlot extends Plot {

    private String facilityName;

   public CommunityPlot(double length, double width) {

        super(length, width);

        facilityName = "Facility-" + plotNumber;
    }

    @Override
    public void display(String blockName) {

        System.out.println("\nBlock: " + blockName);

        displayDetails();

        System.out.println("Facility: " + facilityName);
    }
}
