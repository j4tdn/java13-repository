package demo;

import abstract_factory.AbstractFactory;
import abstract_factory.FactoryProducer;
import abstract_factory.Person;
import abstract_factory.Pet;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory personFactory = FactoryProducer.getFactory("Person");
        AbstractFactory petFactory = FactoryProducer.getFactory("Pet");

        Pet cat = petFactory.getPet("Cat");
        cat.eat();

        Person child = personFactory.getPerson("Child");
        child.feedPet();

        Pet dog = petFactory.getPet("Dog");
        dog.eat();

        Person adult = personFactory.getPerson("Adult");
        adult.feedPet();


    }
}
