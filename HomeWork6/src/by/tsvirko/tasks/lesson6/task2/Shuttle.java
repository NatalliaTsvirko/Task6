package by.tsvirko.tasks.lesson6.task2;

public class Shuttle implements IStart {



    @Override
    public boolean systemPreLaunchCheck() {
        return false;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт Шатла.");

    }


}
