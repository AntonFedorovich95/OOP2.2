package ru.skypro;

public class Hogwarts {
    private static String name;
    private static int thePowerOfMagic;
    private static int theDistanceOfTransgression;

    public Hogwarts(String name, int thePowerOfMagic, int theDistanceOfTransgression) {
        this.thePowerOfMagic = thePowerOfMagic;
        this.theDistanceOfTransgression = theDistanceOfTransgression;
        this.name = name;
    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public String getName() {
        return name;
    }

    public int getTheDistanceOfTransgression() {
        return theDistanceOfTransgression;
    }

    @Override
    public String toString() {
        return "Студент - " + name +
                ", Сила магии = " + thePowerOfMagic +
                ", Дальность магии = " + theDistanceOfTransgression + ".";
    }

    public void comparisonOfProperties(Hogwarts student) {
        if (this.getThePowerOfMagic() > student.getThePowerOfMagic()) {
            System.out.println(this.getName() + " сила магии больше чем у " + student.getName());
        } else if (this.getThePowerOfMagic() == student.getThePowerOfMagic()) {
            System.out.println("Студенты обладают одинаковой силой магии!");
        } else {
            System.out.println(student.getName() + " сила магии больше чем у " + this.getName());
        }
    }
}