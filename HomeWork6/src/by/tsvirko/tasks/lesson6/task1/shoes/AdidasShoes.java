package by.tsvirko.tasks.lesson6.task1.shoes;

public class AdidasShoes implements Shoes{


    public AdidasShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел ботинки Адидас" );

    }

    @Override
    public void remove() {
        System.out.println("Снял ботинки Адидас ");

    }
}
