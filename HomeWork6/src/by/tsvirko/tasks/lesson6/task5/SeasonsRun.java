package by.tsvirko.tasks.lesson6.task5;

import by.tsvirko.tasks.lesson6.task4.Instruments;

public class SeasonsRun {
    public static void main(String[] args) {
        Seasons seasons = Seasons.SUMMER;
        System.out.println(seasons + " , потому что лето есть лето .");
        printSeason(Seasons.SUMMER);
        printAll();

    }

    public static void printSeason(Seasons seasons) {
        switch (seasons) {
            case WINTER:
                System.out.println("Я люблю зиму.");
                break;
            case SPRING:
                System.out.println("Я люблю весну.");
                break;
            case SUMMER:
                System.out.println("Я люблю лето.");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень.");
                break;
        }
    }

    public static void printAll() {
        for (Seasons seasonsAll : Seasons.values()) {
            System.out.println(seasonsAll + " : средняя температура " + seasonsAll.getAvgTemp()
                    + " " + seasonsAll.getDescription());
        }
    }
}
