public class Main{

    public static void main(String[] args) {

        Society s = new Society(
                "Blue Village","Lahore","REG-101");

        Block b1 = new Block("Block A", "A1");
        Block b2 = new Block("Block B", "B1");

        ResidentialPlot p1 = new ResidentialPlot(30, 40);
        ResidentialPlot p2 = new ResidentialPlot(25, 40);

        CommercialPlot p3 = new CommercialPlot(40, 50);

        CommunityPlot p4 = new CommunityPlot(50, 60);

        b1.addPlot(p1);
        b1.addPlot(p2);
        b1.addPlot(p3);

        b2.addPlot(p4);

        s.addBlock(b1);
        s.addBlock(b2);

        p1.allocate("Ali", "134340-0613-7",
                    "03001234567");

        s.displayDetails();
    }
}