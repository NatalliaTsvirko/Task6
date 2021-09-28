package by.tsvirko.tasks.lesson6.task1;

import by.tsvirko.tasks.lesson6.task1.jacket.Jacket;
import by.tsvirko.tasks.lesson6.task1.pants.Pants;
import by.tsvirko.tasks.lesson6.task1.shoes.Shoes;

public class Person implements IPerson {
    private String name;
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public Person() {
    }

    public Person(String name, Jacket jacket, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Shoes shoes) {

        this.name = name;
        this.shoes = shoes;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void putOn() {
        System.out.println(this.name + " : ");
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void remove() {
        System.out.println(this.name + " : ");
        jacket.remove();
        pants.remove();
        shoes.remove();
    }
}
