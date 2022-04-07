package abstract_factory;

import java.util.Objects;

public class PersonFactory extends AbstractFactory{
    @Override
    public Pet getPet(String pet) {
        return null;
    }

    @Override
    public Person getPerson(String person) {
        if (Objects.isNull(person)) return null;
        if (person.equalsIgnoreCase("child")){
            return new Child();
        }
        if (person.equalsIgnoreCase("adult")){
            return new Adult();
        }
        throw new IllegalArgumentException();
    }
}
