package ru.skypro;

public class Gryffindor extends Hogwarts {
    private static int nobility;
    private static int honor;
    private static int bravery;

    public Gryffindor(String name, int thePowerOfMagic, int theDistanceOfTransgression, int nobility, int honor, int bravery) {
        super(name, thePowerOfMagic, theDistanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() + " Факультет Гриффиндор " +
                ", Благородтво = " + nobility +
                ", Честь = " + honor +
                ", Храбрость = " + bravery + ".";
    }

    public void comparisonOfPropertiesGryffindor(Gryffindor student) {
        if (this.getBravery() > student.getBravery()) {
            System.out.println(this.getName() + " благороднее чем " + student.getName());
        } else if (this.getBravery() == student.getBravery()) {
            System.out.println("Студенты благородны одинаково!");
        } else {
            System.out.println(student.getName() + " благороднее чем " + this.getName());
        }
    }
}