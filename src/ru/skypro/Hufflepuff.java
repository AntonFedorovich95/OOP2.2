package ru.skypro;

public class Hufflepuff extends Hogwarts {
    private int Diligence;
    private int Loyalty;
    private int Honesty;

    public Hufflepuff(String name, int thePowerOfMagic, int theDistanceOfTransgression, int diligence, int loyalty, int honesty) {
        super(name, thePowerOfMagic, theDistanceOfTransgression);
        Diligence = diligence;
        Loyalty = loyalty;
        Honesty = honesty;
    }

    public int getDiligence() {
        return Diligence;
    }

    public int getLoyalty() {
        return Loyalty;
    }

    public int getHonesty() {
        return Honesty;
    }

    @Override
    public String toString() {
        return super.toString() + "Пуффендуй {" +
                ", Трудолюбие = " + Diligence +
                ", Верность = " + Loyalty +
                ", Честность = " + Honesty +
                "} ";
    }

    public void comparisonOfPropertiesHufflepuff(Hufflepuff student) {
        if (this.getHonesty() > student.getHonesty()) {
            System.out.println(this.getName() + " честнее чем " + student.getName());
        } else if (this.getHonesty() == student.getHonesty()) {
            System.out.println("Студенты честны одинаково!");
        } else {
            System.out.println(student.getName() + " честнее чем " + this.getName());
        }
    }
}