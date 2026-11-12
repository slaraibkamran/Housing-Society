class ResidentialPlot extends Plot {

    public static int nextHouseNumber = 1;

    public String houseNumber;

    ResidentialPlot(double length, double width) {

        super(length, width);

        houseNumber = "H-" + nextHouseNumber++;
    }

    @Override
    public void display(String blockName) {

        System.out.println("\nBlock: " + blockName
                + " | House Number: " + houseNumber);

        displayDetails();
    }
}


