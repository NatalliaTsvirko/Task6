package by.tsvirko.tasks.lesson6.task2;

import java.util.Random;

public class Cosmodrom {
    public Cosmodrom() {
    }

    private IStart iStart;

    public Cosmodrom(IStart iStart) {
        this.iStart = iStart;
    }

    public IStart getiStart() {
        return iStart;
    }

    public void launching(IStart iStart) {
        if (false) {
            System.out.println("Предстартовая проверка провалена.");
        } else {
            System.out.println("Производим запуск двигателя.");

        }
        int i = 1;
        while (i <= 10) {
            System.out.println("Обратный отсчет : " + i);
            i++;
        }
    }

}










