public class Main {
    public static void main(String[] args) {
        Horse horse1 = new Horse("Roach", '1', 0.5);
        Horse horse2 = new Horse("Leya", '2', 0.5);
        Horse horse3 = new Horse("Gilbert", '3', 0.5);
        Race race = new Race(10);
        race.addHorse(horse1, 1);
        race.addHorse(horse2, 2);
        race.addHorse(horse3, 3);
        race.startRace();
    }
}
