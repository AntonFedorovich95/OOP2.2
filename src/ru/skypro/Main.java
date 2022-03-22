package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри Поттер", 76, 75, 50, 60, 99);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 80, 45, 50, 65, 56);
        Gryffindor ron = new Gryffindor("Рон Уизли", 67, 50, 64, 67, 78);

        Slytherin drako = new Slytherin("Драко Малфой", 70, 55, 60, 57, 72, 68, 59);
        Slytherin grehem = new Slytherin("Грэхэм Монтегю", 50, 54, 57, 48, 73, 55, 45);
        Slytherin gregory = new Slytherin("Грегори Гойл", 45, 30, 34, 58, 64, 60, 71);

        Hufflepuff zacharia = new Hufflepuff("Захария Смит", 63, 59, 60, 54, 70);
        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 45, 54, 67, 56, 89);
        Hufflepuff djastin = new Hufflepuff("Джастин Финч-Флетчли", 40, 48, 65, 71, 63);


        Ravenclaw joy = new Ravenclaw("Чжоу Чанг", 54, 67, 54, 56, 80, 46);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 66, 52, 46, 59, 43, 67);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 43, 50, 50, 67, 43, 59);
        System.out.println("harry = " + harry);
    }
}