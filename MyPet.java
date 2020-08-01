
/**
 * Course: CS55 Java Programming
 * Santa Monica College: Summer 2020
 * Student: Mariam Joan
 * Student ID: 1370114
 * Program Description: Final Exam
 * */


public class MyPet {
    /* 4 private instance variables */
    private String name;
    private String color;
    private char gender;
    private double weight;

    // 3 overloaded constructors
    public MyPet() {
    }

    public MyPet(String name) {
        this.name = name;
    }

    public MyPet(String name, String color, char gender, double weight) {
        this.gender = gender;
        this.weight = weight;
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MyPet {" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", weight=" + weight +
                '}';
    }
}

class MyPetDemo {
    public static void main(String[] args) {
        /** instantiate new instance of MyPet */
        MyPet p = new MyPet ();

        /** call setter methods */
        p.setColor ( "brown" );
        p.setGender ( 'f' );
        p.setName ( "Sparky" );
        p.setWeight ( 4.5 );

        /** call getter methods */
        String myPetColor = p.getColor ();
        char myPetGender = p.getGender ();
        String myPetName = p.getName ( );
        double myPetWeight = p.getWeight ( );

        /** print out methods to user */
        System.out.println("The MyPet Class looks like this: "  + p.toString ());
        System.out.println("My pet's name is: "  + myPetName);
        System.out.println("My pet's color is: "  + myPetColor);
        System.out.println("My pet's gender is: "  + myPetGender);
        System.out.println("My pet's weight is: "  + myPetWeight);
    }

}