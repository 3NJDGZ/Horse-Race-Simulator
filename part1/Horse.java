/**
 * Horse Class object
 * 
 * @author Alejandro De Guzman
 * @version 17/03/25 Version 1
 */

public class Horse {

    // Fields of class Horse
    private String name;
    private char symbol;
    private int distanceTravelled = 0;
    private boolean fallen = false;
    private double confidenceRating;

    // Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(String name, char symbol, double confidenceRating) {
        this.name = name;
        this.symbol = symbol;
        if (confidenceRating < 1.0 && confidenceRating > 0.0) {
            this.confidenceRating = confidenceRating;
        } else {
            throw new IllegalArgumentException("Confidence Rating must be between 0 and 1 exclusive!");
        }
    }

    // Other methods of class Horse
    public void fall() {
        this.fallen = true;
    }

    public double getConfidence() {
        return this.confidenceRating;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public String getName() {
        return this.name;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public void goBackToStart() {
        this.distanceTravelled = 0;
    }

    public boolean hasFallen() {
        if (this.fallen) {
            return true;
        }
        return false;
    }

    public void moveForward() {
        this.distanceTravelled += 1;
    }

    public void setConfidence(double newConfidence) {
        this.confidenceRating = newConfidence;
    }

    public void setSymbol(char newSymbol) {
        this.symbol = newSymbol;
    }

}
