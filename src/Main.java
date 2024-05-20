public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {new Gryffindor("Гарри Поттер", 50, 40, 25, 48, 15), new Gryffindor("Гермиона Грейнджер", 40, 60, 85, 28, 31), new Gryffindor("Рон Уизли", 58, 15, 65, 18, 1),};


        Hufflepuff[] hufflepuffs = {new Hufflepuff("Захария Смит", 10, 30, 41, 12, 15), new Hufflepuff("Седрик Диггори", 20, 20, 55, 18, 21), new Hufflepuff("Джастин Финч-Флетчли", 18, 15, 15, 8, 10),};

        Ravenclaw[] ravenclaws = {new Ravenclaw("Чжоу Чанг", 50, 40, 25, 48, 15, 22), new Ravenclaw("Падма Патил", 40, 60, 85, 28, 31, 11), new Ravenclaw("Маркус Белби", 58, 15, 65, 18, 1, 13),};

        Slytherin[] slytherins = {new Slytherin("Драко Малфой", 50, 40, 25, 48, 15, 10, 25), new Slytherin("Грэхэм Монтегю", 40, 60, 85, 28, 31, 22, 1), new Slytherin("Грегори Гойл", 58, 15, 65, 18, 19, 21, 3),};

        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);
        printService.print(slytherins);

        CompareStudents compareStudents = new CompareStudents();
        compareStudents.compareStudents(gryffindors[0], gryffindors[2]);
        compareStudents.compareStudents(hufflepuffs[1], hufflepuffs[2]);
        compareStudents.compareStudents(ravenclaws[0], ravenclaws[1]);
        compareStudents.compareStudents(slytherins[1], slytherins[2]);
        compareStudents.compareStudents(gryffindors[0], slytherins[2]);

    }
}