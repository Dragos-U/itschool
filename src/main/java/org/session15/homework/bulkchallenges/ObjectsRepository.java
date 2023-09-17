package org.session15.homework.bulkchallenges;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ObjectsRepository<T> {

    private Map<Integer,T> repository = new HashMap<>();

    private Integer customHashCode(T object){
        return object.hashCode();
    }

    public void addObject(T object){
        repository.put(customHashCode(object), object);
    }
}

class TestObjectsRepository{

    public static void main(String[] args) {
        Person alice1 = new Person("Alice", 23, null);
        Person alice2 = new Person("Alice", 23, null);
        Person ken = new Person("Ken", 32, null);

        Product product1 = new Product("green apple", 2, 43);
        Product product2 = new Product("green apple", 2, 43);

        ObjectsRepository<Person> personRepo = new ObjectsRepository<>();
        personRepo.addObject(alice1);
        personRepo.addObject(alice2);
        personRepo.addObject(ken);

        ObjectsRepository<Product> productRepo = new ObjectsRepository<>();
        productRepo.addObject(product1);
        productRepo.addObject(product2);

        System.out.println(personRepo);
        System.out.println(productRepo);


    }
}
