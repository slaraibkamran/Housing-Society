public class Block {
    private String blockName;
    private String blockCode;
    private Plot[] plots;
    private int plotCount;

    public Block(String blockName, String blockCode) {
        this.blockName = blockName;
        this.blockCode = blockCode;
        plots = new Plot[10];
        plotCount = 0;
    }

    public void addPlot(Plot p) {
        if (plotCount < plots.length) {
            plots[plotCount] = p;
            plotCount++;
        } else {
            System.out.println("Block is full");
        }
    }

    public void displayBlock() {
        System.out.println("Block:" + blockName);
        System.out.println("Block:" + blockCode);

        for (int i = 0; i < plotCount; i++) {
            plots[i].display(blockName);
        }
    }
}