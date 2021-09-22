package by.tsvirko.tasks.lesson6.task1;

import by.tsvirko.tasks.lesson6.task1.jacket.AdidasJacket;
import by.tsvirko.tasks.lesson6.task1.jacket.Jacket;
import by.tsvirko.tasks.lesson6.task1.jacket.NikeJacket;
import by.tsvirko.tasks.lesson6.task1.pants.AdidasPants;
import by.tsvirko.tasks.lesson6.task1.pants.NikePants;
import by.tsvirko.tasks.lesson6.task1.pants.Pants;
import by.tsvirko.tasks.lesson6.task1.shoes.AdidasShoes;
import by.tsvirko.tasks.lesson6.task1.shoes.NikeShoes;
import by.tsvirko.tasks.lesson6.task1.shoes.Shoes;

public class Run {

    public static void main(String[] args){

        Jacket nikeJacket = new NikeJacket();
        Jacket adidasJacket = new AdidasJacket();
        Pants nikePants = new NikePants();
        Pants adidasPants = new AdidasPants();
        Shoes nikeShoes = new NikeShoes();
        Shoes adidasShoes = new AdidasShoes();

        Person personOne = new Person( "Bob");
        Person personTwo = new Person("Doby");
        Person personThree = new Person("Valdemor");
        Person personFoure = new Person("Koko" );
        personOne.putOn();
        System.out.println();
        personTwo.remove();
        personThree.remove();
        personFoure.putOn();
        personFoure.remove();

        }



}

