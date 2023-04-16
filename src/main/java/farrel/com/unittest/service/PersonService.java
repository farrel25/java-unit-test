package farrel.com.unittest.service;

import farrel.com.unittest.data.Person;
import farrel.com.unittest.repository.PersonRepository;

import java.util.Objects;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id) {
        Person person = personRepository.selectById(id);

        if (Objects.nonNull(person)) {
            return person;
        } else {
            throw new IllegalArgumentException("Person not found");
        }
    }
}
