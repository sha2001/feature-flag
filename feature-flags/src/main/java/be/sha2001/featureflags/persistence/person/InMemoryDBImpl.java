package be.sha2001.featureflags.persistence.person;

import be.sha2001.featureflags.business.person.Person;
import be.sha2001.featureflags.business.person.PersonPersistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class InMemoryDBImpl implements PersonPersistence {

    Map<String, Person> personMap = new HashMap<>();

    @Override
    public List<Person> getAllPersons() {
        return personMap.values().stream().toList();
    }

    @Override
    public Optional<Person> getPersonById(String id) {
        return Optional.ofNullable(personMap.get(id));
    }

    @Override
    public Person savePerson(Person person) {
        return personMap.put(person.getId(), person);
    }

    @Override
    public List<Person> findByName(String name) {

        return personMap.values().stream().filter(person -> person.getName().contains(name)).toList();
    }

    @Override
    public Person updatePerson(Person person) {
        return  personMap.put(person.getId(), person);
    }

    @Override
    public void deletePerson(String id) {
        personMap.remove(id);
    }
}
