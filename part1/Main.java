public class Main {
    public static void main(String[] args) {
        // Horse horse1 = new Horse("Roach", '1', 0.5);
        // Horse horse2 = new Horse("Leya", '2', 0.5);
        // Horse horse3 = new Horse("Gilbert", '3', 0.5);
        // Race race = new Race(10);
        // race.addHorse(horse1, 1);
        // race.addHorse(horse2, 2);
        // race.addHorse(horse3, 3);
        // race.startRace();

        // test constructor
        // try {
        // Horse testHorse = new Horse("Roach", 'R', 0);
        // System.out.println("No Bug!");
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        // testing fall method
        // Horse testHorse = new Horse("Roach", 'R', 0.5);
        // System.out.println("Fall state: " + testHorse.hasFallen());
        // testHorse.fall();
        // System.out.println("Fall state: " + testHorse.hasFallen());

        // testing getter and setter methods...
        // Horse testHorse = new Horse("Roach", 'R', 0.5);
        // System.out.println("Confidence Rating: " + testHorse.getConfidence());
        // System.out.println("Setting new confidence!");
        // testHorse.setConfidence(0.6);
        // System.out.println("Confidence Rating: " + testHorse.getConfidence());
        // System.out.println("\nChecking Boundaries!");

        // check boundaries
        // testHorse.setConfidence(0);
        // System.out.println("Confidence Rating: " + testHorse.getConfidence());
        // testHorse.setConfidence(1);
        // System.out.println("Confidence Rating: " + testHorse.getConfidence());
        // testHorse.setConfidence(-1);
        // System.out.println("Confidence Rating: " + testHorse.getConfidence());
        // testHorse.setConfidence(10);
        // System.out.println("Confidence Rating: " + testHorse.getConfidence());

        // testing distance methods...
        Horse testHorse = new Horse("Roach", 'R', 0.5);
        System.out.println("Horse Distance: " + testHorse.getDistanceTravelled());
        testHorse.moveForward();
        System.out.println("Horse Distance: " + testHorse.getDistanceTravelled());
        testHorse.moveForward();
        System.out.println("Horse Distance: " + testHorse.getDistanceTravelled());
        testHorse.moveForward();
        System.out.println("Horse Distance: " + testHorse.getDistanceTravelled());

        System.out.println("\nGoing back to start!");
        testHorse.goBackToStart();
        System.out.println("Horse Distance: " + testHorse.getDistanceTravelled());
    }
}
