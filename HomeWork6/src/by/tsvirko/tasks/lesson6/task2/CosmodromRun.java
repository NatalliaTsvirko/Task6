package by.tsvirko.tasks.lesson6.task2;

import java.util.Random;

public class CosmodromRun {
    public static void main(String[] args) {

        int[] array = new int[1];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(11);
            if (array[i] > 3) {
                System.out.println("Проверка прошла успешно.");

            } else {
                System.out.println("Проверка провалена.");
            }
        }
        Shuttle shuttleFirst = new Shuttle();

        shuttleFirst.systemPreLaunchCheck();
        shuttleFirst.engineStart();

        shuttleFirst.start();

    }

}
