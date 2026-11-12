public abstract class Plot {

    private static int nextPlotNumber = 1;

    public static final double RATE = 5000;

    public int plotNumber;
    public double length;
    public double width;
    public double price;
    public String status;

    
    public String ownerName;
    public String cnic;
    public String phoneNumber;

    Plot(double length, double width) {

        this.plotNumber = nextPlotNumber++;
        this.length = length;
        this.width = width;

        this.price = area() * RATE;
        this.status = "Available";

        this.ownerName = "Not Assigned";
        this.cnic = "Not Assigned";
        this.phoneNumber = "Not Assigned";
    }

    public double area() {
        return length * width;
    }

    public double calculatePrice() {
        return area() * RATE;
    }

    public void allocate(String name, String cnic,
                         String phoneNumber) {

        if (status.equals("Available")) {

            this.ownerName = name;
            this.cnic = cnic;
            this.phoneNumber = phoneNumber;

            status = "Allocated";

            System.out.println("Plot allocated!");
        } else {
            System.out.println("Plot already allocated!");
        }
    }

    public void release() {
        status = "Available";

        ownerName = "Not Assigned";
        cnic = "Not Assigned";
        phoneNumber = "Not Assigned";
    }

    public void displayDetails() {

        System.out.println("Plot Number: " + plotNumber);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area());
        System.out.println("Price: Rs. " + calculatePrice());
        System.out.println("Status: " + status);

        System.out.println("Owner Name: " + ownerName);
        System.out.println("CNIC: " + cnic);
        System.out.println("Phone: " + phoneNumber);
    }

    public abstract void display(String blockName);
}