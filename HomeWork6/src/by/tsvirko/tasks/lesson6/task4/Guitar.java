package by.tsvirko.tasks.lesson6.task4;

public class Guitar implements Instruments{
    private int strings;

    public Guitar() {
    }

    public Guitar(int strings) {
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара , количество струн " + strings + ".");
    }
}
