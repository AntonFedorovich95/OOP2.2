package ru.skypro;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int thePowerOfMagic, int theDistanceOfTransgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, thePowerOfMagic, theDistanceOfTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() + "Слизерин {" +
                ", Хитрость = " + cunning +
                ", Решительность = " + determination +
                ", Амбициозность = " + ambition +
                ", Находчивость = " + resourcefulness +
                ", Жажда власти = " + thirstForPower +
                "} ";
    }

    public void comparisonOfPropertiesSlytserin(Slytherin student) {
        if (this.getCunning() > student.getCunning()) {
            System.out.println(this.getName() + " хитрее чем " + student.getName());
        } else if (this.getCunning() == student.getCunning()) {
            System.out.println("Студенты хитры одинаково!");
        } else {
            System.out.println(student.getName() + " хитрее чем " + this.getName());
        }
    }
}

