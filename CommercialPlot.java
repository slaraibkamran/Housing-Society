public class CommercialPlot extends Plot {
    private String shopName;

    public CommercialPlot(double length, double width) {
        super(length, width);
        shopName = "Shop:" + plotNumber;
    }

    @Override
    public void display(String blockName) {
        System.out.println("Block: " + blockName);
        displayDetails();
        System.out.println("Shop Name: " + shopName);
    }
}