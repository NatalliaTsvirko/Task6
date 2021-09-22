package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IHand sonyHand = new SonyHand(100);
        IHead sonyHead = new SonyHead(200);
        ILeg sonyLeg = new SonyLeg(400);
        Robot robot = new Robot(sonyHead, sonyHand,sonyLeg);
        robot.action();
        int price = robot.getPrice();
        System.out.println(price);
        IHead toshibaHead = new ToshibaHead(150);
        IHand toshibaHand = new ToshibaHand(100);
        ILeg toshibaLeg = new ToshibaLeg(310);
        Robot robotTosha = new Robot(toshibaHead,toshibaHand,toshibaLeg);
        robotTosha.action();
        int priceTwo = robotTosha.getPrice();
        System.out.println(priceTwo);
        IHead samsungHead = new SamsungHead(200);
        IHand samsungHand = new SamsungHand(120);
        ILeg samsungLeg = new SamsungLeg(300);
        Robot robotSamsa = new Robot(samsungHead,samsungHand,samsungLeg);
        robotSamsa.action();
        int priceThree = robotSamsa.getPrice();
        System.out.println(priceThree);
        System.out.println();

        IRobot robotA = new Robot (sonyHead,samsungHand,toshibaLeg);
        robotA.action();
        int priceA = robotA.getPrice();
        System.out.println(priceA);
        IRobot robotB = new Robot(samsungHead,toshibaHand,sonyLeg);
        robotB.action();
        int priceB = robotB.getPrice();
        System.out.println(priceB);
        IRobot robotC = new Robot(toshibaHead,sonyHand,samsungLeg);
        robotC.action();
        int priceC = robotC.getPrice();
        System.out.println(priceC);

        System.out.println();
        if (priceA > priceB && priceA > priceC){
            System.out.println(" Робот А самый дорогой");
        }else if(priceB > priceA && priceA > priceC){
            System.out.println("Робот В самый дорогой");
        }else if (priceC > priceA && priceC > priceB){
            System.out.println("Робот С самый дорогой");
        }else {
            System.out.println("Цены равны");
        }
    }
}
