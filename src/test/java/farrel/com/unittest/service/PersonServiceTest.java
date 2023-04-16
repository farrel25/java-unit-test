package farrel.com.unittest.service;

import farrel.com.unittest.data.Person;
import farrel.com.unittest.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions(value = {
        @ExtendWith(value = {MockitoExtension.class})
})
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        this.personService = new PersonService(this.personRepository);
    }

    @Test
    void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> personService.get("1"));
    }

    @Test
    void testGetPersonSuccess() {
        // add behavior to mock object
        Mockito.when(personRepository.selectById("1"))
                .thenReturn(new Person("1", "Farrel"));

        Person person = personService.get("1");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("1", person.getId());
        Assertions.assertEquals("Farrel", person.getName());
    }

    @Test
    void testRegisterSuccess() {
        Person person = personService.register("Farrel");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("Farrel", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(personRepository, Mockito.times(1)).insert(new Person(person.getId(), person.getName()));
    }
}
