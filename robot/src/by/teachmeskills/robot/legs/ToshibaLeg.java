package by.teachmeskills.robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Moved by Toshiba leg");
    }

    @Override
    public void speek() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
