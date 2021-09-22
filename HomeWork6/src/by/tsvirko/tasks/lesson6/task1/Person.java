package by.tsvirko.tasks.lesson6.task1;

import by.tsvirko.tasks.lesson6.task1.jacket.Jacket;
import by.tsvirko.tasks.lesson6.task1.pants.Pants;
import by.tsvirko.tasks.lesson6.task1.shoes.Shoes;

public class Person implements Jacket, Pants, Shoes {
    private String jacket;
    private  String pants;
    private String shoes;
    private String name;

    public Person(String jacket, String pants, String shoes, String name) {
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
        this.name = name;
    }

    public Person(Jacket nikeJacket, Pants nikePants, Shoes nikeShoes) {

    }

    public Person(String name, String jacket) {
        this.name = name;
        this.jacket = jacket;
    }

    public Person(String name, String jacket, String pants) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
    }

    public Person(String name) {

        this.name = name;
    }

    public Person(String s, Pants nikePants, Shoes nikeShoes) {
    }

    @Override
    public void putOn() {

        System.out.println( this.name + " надел " + this.jacket );


    }

    @Override
    public void remove() {

        System.out.println( this.name + " снял : " );
    }
}
