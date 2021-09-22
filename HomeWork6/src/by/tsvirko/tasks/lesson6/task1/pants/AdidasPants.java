package by.tsvirko.tasks.lesson6.task1.pants;

public class AdidasPants implements Pants{
    public AdidasPants() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел штаны Adidas" );
    }

    @Override
    public void remove() {
        System.out.println("Снял штаны Adidas" );
    }
}
