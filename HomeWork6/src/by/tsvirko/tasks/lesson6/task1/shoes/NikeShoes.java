package by.tsvirko.tasks.lesson6.task1.shoes;

public class NikeShoes implements Shoes{

    public NikeShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел ботинки Nike" );

    }

    @Override
    public void remove() {
        System.out.println("Снял ботинки Nike");

    }
}
