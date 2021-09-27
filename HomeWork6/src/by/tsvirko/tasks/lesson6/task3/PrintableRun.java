package by.tsvirko.tasks.lesson6.task3;

public class PrintableRun {
    public static void main(String[] args) {
        Book bookOne = new Book("Математика");
        Book bookTwo = new Book("Химия");
        Book bookThree = new Book("Биология");
        Magazine magazineOne = new Magazine("Cosmopolitan");
        Magazine magazineTwo = new Magazine("Лиза");
        Magazine magazineThree = new Magazine("Здоровье");

        Printable[] printables = new Printable[6];
        printables[0] = bookOne;
        printables[1] = bookTwo;
        printables[2] = bookThree;
        printables[3] = magazineOne;
        printables[4] = magazineTwo;
        printables[5] = magazineThree;

        for (Printable printable: printables) {
            printable.print();
        }
        System.out.println(bookTwo instanceof Book);
        System.out.println(magazineThree instanceof  Magazine);
        Magazine.printMagazines(printables);
        Book.printBooks(printables);

    }
}
