package farrel.com.unittest.service;

import farrel.com.unittest.data.Person;
import farrel.com.unittest.repository.PersonRepository;

import java.util.Objects;
import java.util.UUID;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id) {
        Person person = personRepository.selectById(id);
        if (Objects.isNull(person)) throw new IllegalArgumentException("Person not found");
        return person;
    }

    public Person register(String name) {
        Person person = new Person(UUID.randomUUID().toString(), name);
        personRepository.insert(person);
        return person;
    }
}
