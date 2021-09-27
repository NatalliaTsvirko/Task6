package by.tsvirko.tasks.lesson6.task1.jacket;

public class AdidasJacket implements Jacket{
    public AdidasJacket() {
    }

    @Override
    public void putOn() {
        System.out.println(" Надел куртку Адидас " );

    }

    @Override
    public void remove() {
        System.out.println("Снял куртку Адидас ");

    }
}
