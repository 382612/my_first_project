package nl.bioinf.bengels.GrowthSimulator;

/**
 * "Controller" class
 */
public class CellGrowthSimulator {
    /**
     * @param args command-line args should be length one,
     * containing an initial cell number.
     */
     public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("You must provide an initial cell count. Aborting.");
        }
        //args[] is a String array, so the item at index [0]
        //should be converted into and `int` first.
        int initialCellNumber = Integer.parseInt(args[0]);
        startSimulation(initialCellNumber);
    }

    public static void startSimulation(int initialCellNumber) {
        TestTube testTube = new TestTube(initialCellNumber);
        //do one iteration of growing
        testTube.growCells();
        //usage within GrowthSimulator
        Cell cell = new Cell();
        cell.grow();
        cell.grow();
        System.out.println("..........");
        CancerCell cCell = new CancerCell();
        cCell.grow();
        cCell.grow();
        cCell.move();
    }

}

