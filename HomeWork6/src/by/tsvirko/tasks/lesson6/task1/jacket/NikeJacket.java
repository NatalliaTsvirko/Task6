package by.tsvirko.tasks.lesson6.task1.jacket;

public class NikeJacket implements Jacket{

    public NikeJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел куртку Nike" );

    }

    @Override
    public void remove() {
        System.out.println("Снял куртку Nike");

    }
}
