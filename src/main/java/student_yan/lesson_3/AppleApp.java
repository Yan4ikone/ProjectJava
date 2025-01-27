package student_yan.lesson_3;

public class AppleApp {

    public static void main(String[] args) {

        Apple apple1 = new Apple("Антоновка", "Green", 700 );
        Apple apple2 = new Apple("Пантоновка", "Red", 600 );
        Apple apple3 = new Apple("Малиновка", "Yellow", 200 );

        System.out.println("Apple 1 type " + apple1.getType());
        System.out.println("Apple 2 colour " + apple2.getColour());
        System.out.println("Apple 3 weight " + apple3.getWeight());
    }

}
