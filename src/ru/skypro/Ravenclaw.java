package ru.skypro;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String name, int thePowerOfMagic, int theDistanceOfTransgression, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, thePowerOfMagic, theDistanceOfTransgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    @Override
    public String toString() {
        return super.toString() + "Факультет Когтевран " +
                ", Ум = " + smart +
                ", Мудрость = " + wise +
                ", Остроумие = " + witty +
                ", Творчество = " + fullOfCreativity;
    }

    public void comparisonOfPropertiesRavenclaw(Ravenclaw student) {
        if (this.getSmart() > student.getSmart()) {
            System.out.println(this.getName() + " умнее чем " + student.getName());
        } else if (this.getSmart() == student.getSmart()) {
            System.out.println("Студенты умны одинаково!");
        } else {
            System.out.println(student.getName() + " умнее чем " + this.getName());
        }
    }
}