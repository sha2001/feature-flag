package be.sha2001.featureflags.business.person;

import java.util.List;
import java.util.Optional;

public interface PersonPersistence {

    List<Person> getAllPersons();

    Optional<Person> getPersonById(String id);

    Person savePerson(Person person);

    List<Person> findByName(String name);

    Person updatePerson(Person person);

    void deletePerson(String id);
}
