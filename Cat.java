public class Cat extends Animal {
    public boolean hunger;
    public int catPortion;
    public static int catBowl = 70;
    public Cat(String name, boolean hunger, int catPortion){
        this.name = name;
        this.hunger = hunger;
        this.catPortion = catPortion;
    }
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Cat " + name + " stay stand.");
        } else if (distance > 200) {
            System.out.println("Cat " + name + " not finished.");
        } else {
            System.out.println("Cat " + name + " ran " + distance + " meters.");
        }
    }

    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Cat " + name + " stay alive.");
        } else {
            System.out.println("Cat " + name + " can't swim.");
        }
    }

    public static int replenishCatBowl(int newFood) {
        return catBowl += newFood;
    }
}
