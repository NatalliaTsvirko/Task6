package by.tsvirko.tasks.lesson6.task4;

public class Pipe implements Instruments{
    private int diameter;

    public Pipe() {
    }

    public Pipe(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром "  + diameter + " мм.");
    }
}
