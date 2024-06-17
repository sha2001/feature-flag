package be.sha2001.featureflags.persistence.person;

import be.sha2001.featureflags.business.person.Person;
import be.sha2001.featureflags.business.person.PersonPersistence;

import java.util.List;
import java.util.Optional;

public class PersonMongoImpl  implements PersonPersistence {
    @Override
    public List<Person> getAllPersons() {
        return List.of();
    }

    @Override
    public Optional<Person> getPersonById(String id) {
        return null;
    }

    @Override
    public Person savePerson(Person person) {
        return null;
    }

    @Override
    public List<Person> findByName(String name) {
        return List.of();
    }

    @Override
    public Person updatePerson(Person person) {
        return null;
    }

    @Override
    public void deletePerson(String id) {

    }
}
