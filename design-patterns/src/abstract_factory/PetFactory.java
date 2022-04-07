package abstract_factory;

import java.util.Objects;

public class PetFactory extends AbstractFactory{
    @Override
    public Pet getPet(String pet) {
        if (Objects.isNull(pet)) return null;
        if (pet.equalsIgnoreCase("cat")){
            return new Cat();
        }
        if (pet.equalsIgnoreCase("dog")){
            return new Dog();
        }
        throw new IllegalArgumentException();
    }


    @Override
    public Person getPerson(String person) {
        return null;
    }
}
