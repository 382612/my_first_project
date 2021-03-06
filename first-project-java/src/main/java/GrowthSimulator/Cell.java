package nl.bioinf.bengels.GrowthSimulator;

class Cell {
    /**
     * Instance variable "size"; 5 micrometer is the default diameter when Cell objects are instantiated
     */
    int diameter = 5;
    int growthIncrement = 1;

    /**
     * Lets this cell grow in a single increment
     */
    void grow() {
        //grow by 1 micrometer
        this.diameter += growthIncrement;
        System.out.println("I am a Cell. My size is " + this.diameter);
    }
}