package abstract_factory;

import java.util.Objects;

public class FactoryProducer {
    private FactoryProducer(){

    }
    public static AbstractFactory getFactory(String factory){
        if (Objects.isNull(factory)) return null;
        if (factory.equalsIgnoreCase("Person")){
            return new PersonFactory();
        }
        if (factory.equalsIgnoreCase("Pet")){
            return new PetFactory();
        }
        throw new IllegalArgumentException();
    }
}
