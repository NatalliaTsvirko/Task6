package by.teachmeskills.robot.hands;

public class SonyHand implements IHand{
    private int price;

    public SonyHand(int price) {

        this.price = price;
    }

    public SonyHand() {
    }


    @Override
    public void upHand() {
        System.out.println("Riced Sony Hand");

    }

    @Override
    public int getPrice() {

        return price;
    }
}
