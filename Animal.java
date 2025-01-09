public class Animal {
    private static int countAnimal;
    public String name;
    public int distance;
    public Animal() {
        countAnimal++;
    }
    public void Distance(int distance) {
        this.distance = distance;
    }
    public static int getCountAnimal() {
        return countAnimal;
    }
    public void run(int distance) {
        System.out.println("Animal ran " + distance + "meters.");
    }
    public void swim(int distance) {
        System.out.println("Animal swam " + distance + "meters.");
    }
}
