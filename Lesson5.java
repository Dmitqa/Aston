public class Lesson5 {
    public static void main(String[] args) {
        //Triangle tri = new Triangle(5, 6, 7);
        //tri.infoGeometricFigure();

        //Rectangle rec = new Rectangle(5, 7);
        //rec.infoGeometricFigure();

        //Circle cir = new Circle(10);
        //cir.infoGeometricFigure();


        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Bars", false, 25);
        catsArray[1] = new Cat("Kitty", false, 17);
        catsArray[2] = new Cat("Snowball", false, 30);
        catsArray[3] = new Cat("Tom", false, 22);
        catsArray[4] = new Cat("Mimi", false, 10);

        System.out.println(Cat.catBowl);

        for (Cat value : catsArray) {
            if (value.catPortion <= Cat.catBowl) {
                Cat.catBowl -= value.catPortion;
                value.hunger = true;
            }
        }

        for (Cat cat : catsArray) {
            if (cat.hunger) {
                System.out.println(cat.name + " is full.");
            } else {
                System.out.println(cat.name + " is hungry.");
            }
        }

        System.out.println("In bowl " + Cat.catBowl + " food.");
        int currentBowl = Cat.replenishCatBowl(100);
        System.out.println("In bowl " + currentBowl + " food.");

        catsArray[1].run(250);
        catsArray[1].swim(250);

        Dog Puppey = new Dog("Puppey");
        Puppey.swim(100);
        Puppey.run(-100);
    }
}
