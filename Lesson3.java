import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        method13(12);

    }

    public static void printThreeWords() {
        String[] fruit = {"Orange", "Banana", "Apple"};
        for (String el : fruit) {
            System.out.println(el);
        }
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -11;
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        int value = 320;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 45;
        int b = 6;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    public static void method5(int a, int b) {
        System.out.println(a + b >= 10 && a + b <= 20);
    }

    public static void method6(int num) {
        System.out.println(num >= 0 ? "Положительное" : "Отрицательное");
    }

    public static void method7(int num) {
        System.out.println(num < 0);
    }

    public static void method8(String word, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(word);
        }
    }

    public static void method9(int year) {
        System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }

    public static void method10() {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int el = 0; el < mass.length; el++) {
            mass[el] = Math.abs(mass[el] - 1);
        }
        System.out.println(Arrays.toString(mass));
    }

    public static void method11() {
        int[] arr = new int[100];
        for (int el = 0; el < arr.length; el++) {
            arr[el] += el + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void method12() {
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int el = 0; el < mass.length; el++) {
            mass[el] = mass[el] < 6 ? mass[el] * 2 : mass[el];
        }
        System.out.println(Arrays.toString(mass));
    }

    public static void method13(int len) {
        int[][] quad = new int[len][len];
        for (int x = 0; x < len; x++) {
            for (int y = 0; y < quad[x].length; y++) {
                quad[x][y] = x == y || y == len - x - 1 ? 1 : 0;
                System.out.print(quad[x][y] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] method14(int len, int initialValue) {
        int[] mass = new int[len];
        Arrays.fill(mass, initialValue);
        return mass;
    }
}