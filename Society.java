public class Society {
    public String societyName;
    public String cityName;
    public String registrationNo;

    public Block[] blocks;
    public int blockCount;

    public Society(String societyName, String cityName,
            String registrationNo) {

        this.societyName = societyName;
        this.cityName = cityName;
        this.registrationNo = registrationNo;

        blocks = new Block[5];
        blockCount = 0;
    }

    public void addBlock(Block b) {
        if (blockCount < blocks.length) {
            blocks[blockCount] = b;
            blockCount++;
        } else {
            System.out.println("Society is full!");
        }
    }

    public void displayDetails() {
        System.out.println("Society: " + societyName);
        System.out.println("City: " + cityName);
        System.out.println("Registration: " + registrationNo);

        for (int i = 0; i < blockCount; i++) {
            blocks[i].displayBlock();
        }
    }
}
