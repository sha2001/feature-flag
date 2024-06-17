package be.sha2001.featureflags.business.person;

import be.sha2001.featureflags.common.exception.BusinessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {


    private final PersonPersistence personPersistence;

    public PersonService(PersonPersistence personPersistence) {
        this.personPersistence = personPersistence;
    }

    public List<Person> getAllPersons() {
        return personPersistence.getAllPersons();
    }


    public Optional<Person> getPersonById(String id) {
           return this.personPersistence.getPersonById(id);
    }


    public Person savePerson(Person person) {
        if (person == null) {
            throw new BusinessException("Person cannot be null");
        }
        return this.personPersistence.savePerson(person);
    }


}
