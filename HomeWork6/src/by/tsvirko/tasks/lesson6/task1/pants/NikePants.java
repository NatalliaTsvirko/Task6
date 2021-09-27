package by.tsvirko.tasks.lesson6.task1.pants;

public class NikePants implements Pants{
    public NikePants() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел штаны Nike" );

    }

    @Override
    public void remove() {
        System.out.println("Снял штаны Nike");

    }
}
