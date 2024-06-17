package be.sha2001.featureflags.persistence.person;

import be.sha2001.featureflags.business.person.Person;
import be.sha2001.featureflags.business.person.PersonPersistence;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PersonJpaImpl implements PersonPersistence {


    private final PersonRepository personRepository;
    private final PersonEntityMapper personEntityMapper;

    @Override
    public List<Person> getAllPersons() {
        return personEntityMapper.toDomain(personRepository.findAll());
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
